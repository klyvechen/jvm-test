package rm.project;

import java.util.Date;

public class LocalVariablesTest {

    private int count = 0;

    private static int scount = 0;

    static {
        scount = 1;
    }

    public LocalVariablesTest() {
        this.count = 1;
    }

    public static void main(String[] args) {
        LocalVariablesTest test = new LocalVariablesTest();
        int num = 10;
        test.test1();
    }

    // 練習
    public static void testStatic() {
        LocalVariablesTest test = new LocalVariablesTest();
        Date date = new Date();
        int count = 10;
        System.out.println(count);
        // this不存在於當前方法的局部變量表當中
        // System.out.println(this);
    }

    // 關於Slot的使用理解
    private void test1() {
        Date date = new Date();
        String name = "123421";
        String info = test2(date, name);
        System.out.println(date + name);

    }

    private String test2(Date date, String name) {
        date = null;
        name = "Rock";
        double weight = 130.5;
        char gender = '男';
        return date + name;
    }

    public void test3() {
        this.count++;
    }

    public void test4() {
        int a = 0;
        {
            int b = 0;
            b = a + 1;
        }
        // 變量c使用之前已經銷毀的變量b佔據的slot的位置
        int c = a + 1;
    }

}
