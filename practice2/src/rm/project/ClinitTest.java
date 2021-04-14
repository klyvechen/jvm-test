package rm.project;

public class ClinitTest {
    //任何一個類聲明以後 至少存在一個類的構造器
    private static int a = 1; // a=0 --> a=1
    private int c = 1; // a=0 --> a=1

    public static void main(String[] args) {
        int b = 2;
    }

    public ClinitTest() {
        a = 10;
        int d = 20;
    }

}
