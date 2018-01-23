/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 1997-2014 Oracle and/or its affiliates. All rights reserved.
 *
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common Development
 * and Distribution License("CDDL") (collectively, the "License").  You
 * may not use this file except in compliance with the License.  You can
 * obtain a copy of the License at
 * https://glassfish.dev.java.net/public/CDDL+GPL_1_1.html
 * or packager/legal/LICENSE.txt.  See the License for the specific
 * language governing permissions and limitations under the License.
 *
 * When distributing the software, include this License Header Notice in each
 * file and include the License file at packager/legal/LICENSE.txt.
 *
 * GPL Classpath Exception:
 * Oracle designates this particular file as subject to the "Classpath"
 * exception as provided by Oracle in the GPL Version 2 section of the License
 * file that accompanied this code.
 *
 * Modifications:
 * If applicable, add the following below the License Header, with the fields
 * enclosed by brackets [] replaced by your own identifying information:
 * "Portions Copyright [year] [name of copyright owner]"
 *
 * Contributor(s):
 * If you wish your version of this file to be governed by only the CDDL or
 * only the GPL Version 2, indicate your decision by adding "[Contributor]
 * elects to include this software in this distribution under the [CDDL or GPL
 * Version 2] license."  If you don't indicate a single choice of license, a
 * recipient has the option to distribute your version of this file under
 * either the CDDL, the GPL Version 2 or to extend the choice of license to
 * its licensees as provided above.  However, if you add GPL Version 2 code
 * and therefore, elected the GPL Version 2 license, then the option applies
 * only if the new code is made subject to such option by the copyright
 * holder.
 */

package com.sun.tools.xjc.model;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.activation.MimeType;
import javax.xml.namespace.QName;

import com.sun.tools.xjc.model.nav.NClass;
import com.sun.tools.xjc.model.nav.NType;
import com.sun.tools.xjc.reader.RawTypeSet;
import com.sun.xml.bind.v2.model.core.ElementPropertyInfo;
import com.sun.xml.bind.v2.model.core.ID;
import com.sun.xml.bind.v2.model.core.PropertyKind;
import com.sun.xml.xsom.XSComponent;

import org.xml.sax.Locator;

/**
 * {@link ElementPropertyInfo} for the compiler.
 *
 * @author Kohsuke Kawaguchi
 */
public final class CElementPropertyInfo extends CPropertyInfo implements ElementPropertyInfo<NType,NClass> {

    /**
     * True if this property can never be absent legally.
     */
    private final boolean required;

    private final MimeType expectedMimeType;
    /**
     *
     * <p>
     * Currently, this is set inside {@link RawTypeSet} in a very ugly way.
     */
    private CAdapter adapter;

    private final boolean isValueList;

    private ID id;


    /**
     * List of referenced types.
     */
    private final List<CTypeRef> types = new ArrayList<CTypeRef>();

    private final List<CNonElement> ref = new AbstractList<CNonElement>() {
        public CNonElement get(int index) {
            return getTypes().get(index).getTarget();
        }
        public int size() {
            return getTypes().size();
        }
    };

    // TODO: shouldn't they get id and expectedMimeType from TypeUses of CTypeRef?
    public CElementPropertyInfo(String name, CollectionMode collection, ID id, MimeType expectedMimeType, XSComponent source,
                                CCustomizations customizations, Locator locator, boolean required) {
        super(name, collection.col, source, customizations, locator);
        this.required = required;
        this.id = id;
        this.expectedMimeType = expectedMimeType;
        this.isValueList = collection.val;
    }

    public ID id() {
        return id;
    }

    public List<CTypeRef> getTypes() {
        return types;
    }

    public List<CNonElement> ref() {
        return ref;
    }

    public QName getSchemaType() {
        if(types.size()!=1)
            // if more than one kind is here, can't produce @XmlSchemaType.
            // TODO: is it allowed to have one generated if types
            return null;

        CTypeRef t = types.get(0);
        if(needsExplicitTypeName(t.getTarget(),t.typeName))
            return t.typeName;
        else
            return null;
    }

    /**
     * XJC never uses the wrapper element. Always return null.
     */
    @Deprecated
    public QName getXmlName() {
        return null;
    }

    public boolean isCollectionRequired() {
        // in XJC, we never recognize a nillable collection pattern, so this is always false.
        return false;
    }

    public boolean isCollectionNillable() {
        // in XJC, we never recognize a nillable collection pattern, so this is always false.
        return false;
    }

    public boolean isRequired() {
        return required;
    }

    public boolean isValueList() {
        return isValueList;
    }

    public boolean isUnboxable() {
        if(!isCollection() && !required)
            // if the property can be legally absent, it's not unboxable
            return false;
        // we need to have null to represent the absence of value. not unboxable.
        for (CTypeRef t : getTypes()) {
            if(t.isNillable())
                return false;
        }
        return super.isUnboxable();
    }

    @Override
    public boolean isOptionalPrimitive() {
        // we need to have null to represent the absence of value. not unboxable.
        for (CTypeRef t : getTypes()) {
            if(t.isNillable())
                return false;
        }
        return !isCollection() && !required && super.isUnboxable();
    }

    public <V> V accept(CPropertyVisitor<V> visitor) {
        return visitor.onElement(this);
    }

    @Override
    public <R, P> R accept(CPropertyVisitor2<R, P> visitor, P p) {
        return visitor.visit(this, p);
    }

    public CAdapter getAdapter() {
        return adapter;
    }

    public void setAdapter(CAdapter a) {
        assert adapter == null;
        adapter = a;
    }

    public final PropertyKind kind() {
        return PropertyKind.ELEMENT;
    }

    public MimeType getExpectedMimeType() {
        return expectedMimeType;
    }

    public static enum CollectionMode {
        NOT_REPEATED(false,false),
        REPEATED_ELEMENT(true,false),
        REPEATED_VALUE(true,true);

        private final boolean col,val;

        CollectionMode(boolean col,boolean val) {
            this.col = col;
            this.val = val;
        }

        public boolean isRepeated() { return col; }
    }

    @Override
    public QName collectElementNames(Map<QName, CPropertyInfo> table) {
        for (CTypeRef t : types) {
            QName n = t.getTagName();
            if(table.containsKey(n))    return n;
            table.put(n, this);
        }
        return null;
    }
}
