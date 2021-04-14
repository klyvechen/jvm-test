package java.lang;

public class String {
    //初始化階段
    static {
        System.out.println("我是自定義的String類靜態代碼");
    }

    public static void main(String[] args) {
        System.out.println("hello, stirng");
    }
}
