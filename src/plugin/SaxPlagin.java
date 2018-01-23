package plugin;

import com.sun.codemodel.JAnnotationUse;
import java.io.IOException;

import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;

import com.sun.codemodel.JBlock;
import com.sun.codemodel.JCodeModel;
import com.sun.codemodel.JFieldVar;
import com.sun.codemodel.JMethod;
import com.sun.codemodel.JMod;
import com.sun.codemodel.JType;
import com.sun.codemodel.JVar;
import com.sun.tools.xjc.BadCommandLineException;
import com.sun.tools.xjc.Options;
import com.sun.tools.xjc.Plugin;
import com.sun.tools.xjc.model.CClassInfo;
import com.sun.tools.xjc.model.CElementPropertyInfo;
import com.sun.tools.xjc.model.CPropertyInfo;
import com.sun.tools.xjc.model.CTypeRef;
import com.sun.tools.xjc.model.Model;
import com.sun.tools.xjc.model.nav.NClass;
import com.sun.tools.xjc.outline.ClassOutline;
import com.sun.tools.xjc.outline.Outline;
import java.util.List;
import java.util.Map;

/**
 *
 * @author artur
 */
public class SaxPlagin extends Plugin {

    public final static String ID = "id";
    public final static JType LONG_TYPE = new JCodeModel().LONG;
    public final static String ID_GETTER = "getId";
    public final static JType VOID_TYPE = new JCodeModel().VOID;
    public final static String ID_SETTER = "setId";

    @Override
    public String getOptionName() {
        return "Main-plugin";
    }

    @Override
    public int parseArgument(Options opt, String[] args, int i)
            throws BadCommandLineException, IOException {
        return 1;
    }

    @Override
    public String getUsage() {
        return "  -Xexample-plugin    :  xjc example plugin";
    }

    @Override
    public void postProcessModel(Model model, ErrorHandler errorHandler) {
        System.out.println("postProcessModel");
//        if(model.rootClass != null) {
//            System.out.println("model.rootClass.name()" + model.rootClass.name());
//            System.out.println("model.rootClass._package().name()" + model.rootClass._package().name());
//        }
        //model.
        
        for(Map.Entry<NClass, CClassInfo> e : model.beans().entrySet()) {
            NClass key = e.getKey();
            CClassInfo info = e.getValue();
            for(CPropertyInfo cPropertyInfo : info.getProperties()) {
                System.out.println("\t\tcPropertyInfo = " + cPropertyInfo.getName(true));
                if(cPropertyInfo instanceof CElementPropertyInfo) {
                    CElementPropertyInfo cElementPropertyInfo = (CElementPropertyInfo) cPropertyInfo;
                    for(CTypeRef cTypeRef : cElementPropertyInfo.getTypes()) {
                        System.out.println("\t\t\t||||" + cTypeRef.getTypeName());
                        System.out.println("\t\t\t||||" + cTypeRef.getTagName());
                        System.out.println("\t\t\t||||" + cTypeRef.defaultValue);
                    }
                }
                //cPropertyInfo;
            }
            System.out.println("key.fullName = " + key.fullName());
            System.out.println("isBoxedType = " + key.isBoxedType());
        }
        System.out.println("postProcessModel");
    }

    @Override
    public boolean run(Outline model, Options opt, ErrorHandler errorHandler)
            throws SAXException {

        for (ClassOutline classOutline : model.getClasses()) {
            System.out.println(classOutline.implClass.fullName());
            System.out.println(classOutline.implClass.binaryName());
            System.out.println(classOutline.implClass.name());
            // delete xml doc
            classOutline.implClass.javadoc().clear();
            for (Map.Entry<String, JFieldVar> jf : classOutline.implClass.fields().entrySet()) {
                System.out.println("\tJFieldVar = " + jf.getKey());
                System.out.println("\tJFieldVar TypeName = " + jf.getClass().getSimpleName());
                System.out.println("\tJFieldVar TypeName = " + jf.getClass());
            }
            if (classOutline.implClass.annotations() != null) {
                for (JAnnotationUse ja : classOutline.implClass.annotations()) {

                }
            }
//                    
//                    for(JMethod jm : classOutline.implClass.constructors()) {
//                        
//                    }

            JFieldVar globalId = classOutline.implClass.field(JMod.PRIVATE, LONG_TYPE, ID);

            JMethod idGetterMethod = classOutline.implClass.method(JMod.PUBLIC, LONG_TYPE, ID_GETTER);
            JBlock idGetterBlock = idGetterMethod.body();
            idGetterBlock._return(globalId);

            JMethod idSetterMethod = classOutline.implClass.method(JMod.PUBLIC, VOID_TYPE, ID_SETTER);
            JVar localId = idSetterMethod.param(LONG_TYPE, "_" + ID);
            JBlock idSetterBlock = idSetterMethod.body();
            idSetterBlock.assign(globalId, localId);
        }
        return true;
    }

}

