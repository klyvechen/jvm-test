package rm.project;

import sun.misc.Launcher;

import java.net.URL;
import java.security.Provider;

public class ClassLoaderTest2 {

    public static void main(String[] args) {
        System.out.println("*****啟動引導式加載器*****");
        //獲取Bootstrap classloader的API路徑
        URL[] urls = Launcher.getBootstrapClassPath().getURLs();
        for (URL url : urls) {
            System.out.println(url.toExternalForm());
        }
        System.out.println(Provider.class.getClassLoader());
        System.out.println(System.class.getClassLoader());


        System.out.println("*****啟動擴展式加載器*****");
        //獲取Bootstrap classloader的API路徑
        String string = System.getProperty("java.ext.dirs");
//        for (String path : string.split(":")) {
//            System.out.println(path);
//        }

    }

}
