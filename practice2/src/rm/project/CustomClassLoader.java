package rm.project;


import java.io.FileNotFoundException;

public class CustomClassLoader extends ClassLoader {


    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        try {
            byte[] result = getClassFromCustomPath();
            if (result == null) {
                throw new FileNotFoundException();
            } else {
                return defineClass(name, result, 0, result.length);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        throw new ClassNotFoundException(name);
    }

    private byte[] getClassFromCustomPath() {
        //從自訂義路徑中加載指定類
        //如果指定文件中字節碼文件進行加密 則需要在此方法中解密
        return null;
    }
}
