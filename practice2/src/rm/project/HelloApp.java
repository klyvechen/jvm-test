package rm.project;

public class HelloApp {
    private static int a = 1; // a=0 --> a=1

    static {
        a = 2;
        a = 3;
        b = 20;
//        System.out.println(b); 非法的前向引用
        System.out.println(HelloApp.b);
    }

    private static int b = 10; // linking 之 prepare number = 0 --> initial: 20 --> 10

    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(HelloApp.a);
        System.out.println(HelloApp.b);
    }

}
