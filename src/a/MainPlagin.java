package a;

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
import com.sun.tools.xjc.outline.ClassOutline;
import com.sun.tools.xjc.outline.Outline;
import java.util.Map;
/**
 *
 * @author artur
 */
public class MainPlagin extends Plugin {

  public final static String ID = "id";
	public final static JType LONG_TYPE = new JCodeModel().LONG;
	public final static String ID_GETTER = "getId";
	public final static JType VOID_TYPE = new JCodeModel().VOID;
	public final static String ID_SETTER = "setId";

	@Override
	public String getOptionName() {
		return "Xexample-plugin";
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
	public boolean run(Outline model, Options opt, ErrorHandler errorHandler)
			throws SAXException {

		for (ClassOutline classOutline : model.getClasses()) {
                    System.out.println(classOutline.implClass.fullName());
                    System.out.println(classOutline.implClass.binaryName());
                    System.out.println(classOutline.implClass.name());
                    // delete xml doc
                    classOutline.implClass.javadoc().clear();
                    for(Map.Entry<String, JFieldVar> jf : classOutline.implClass.fields().entrySet()) {
                        System.out.println("\tJFieldVar = " + jf.getKey());
                        System.out.println("\tJFieldVar TypeName = " + jf.getClass().getSimpleName());
                        System.out.println("\tJFieldVar TypeName = " + jf.getClass());
                    }
                    if(classOutline.implClass.annotations() != null) {
                        for(JAnnotationUse ja : classOutline.implClass.annotations()) {
                            
                        }
                    }
                    
//                    for(JMethod jm : classOutline.implClass.constructors()) {
//                        
//                    }
                    
//			JFieldVar globalId = classOutline.implClass.field(JMod.PRIVATE,
//					LONG_TYPE, ID);
//
//			JMethod idGetterMethod = classOutline.implClass.method(JMod.PUBLIC,
//					LONG_TYPE, ID_GETTER);
//			JBlock idGetterBlock = idGetterMethod.body();
//			idGetterBlock._return(globalId);
//
//			JMethod idSetterMethod = classOutline.implClass.method(JMod.PUBLIC,
//					VOID_TYPE, ID_SETTER);
//			JVar localId = idSetterMethod.param(LONG_TYPE, "_" + ID);
//			JBlock idSetterBlock = idSetterMethod.body();
//			idSetterBlock.assign(globalId, localId);
		}
		return true;
	}

}

