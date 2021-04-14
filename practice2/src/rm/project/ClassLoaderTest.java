package rm.project;

public class ClassLoaderTest {

    public static void main(String[] args) {
        //系統
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);


        //擴展
        ClassLoader extClassLoader = systemClassLoader.getParent();
        System.out.println(extClassLoader);


        ClassLoader bootstrapClassLoader = extClassLoader.getParent();
        System.out.println(bootstrapClassLoader);

        ClassLoader appClassLoader = ClassLoaderTest.class.getClassLoader();
        System.out.println(appClassLoader);

        ClassLoader stringClassLoader = String.class.getClassLoader();
        System.out.println(stringClassLoader);

    }

}
