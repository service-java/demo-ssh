package cn.framework.entity;

import javax.tools.JavaFileObject;
import javax.tools.SimpleJavaFileObject;
import java.io.File;

/**
 * @author zhangjinci
 * @version 2016/7/21 19:02
 * @function
 */
public class CharSequenceJavaFileObject extends SimpleJavaFileObject{

    private CharSequence content;


    public CharSequenceJavaFileObject(String javaFilePath, String className, CharSequence content) throws Exception {
        super(new File(javaFilePath + className.replace('.', '/') + JavaFileObject.Kind.SOURCE.extension).toURI(), JavaFileObject.Kind.SOURCE);
        this.content = content;
    }

    @Override
    public CharSequence getCharContent(boolean ignoreEncodingErrors) {
        return content;
    }

}
