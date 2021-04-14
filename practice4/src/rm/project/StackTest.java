package rm.project;

public class StackTest {

    private void methodA() {
        int i = 10;
        int j = 20;
        methodB();

    }

    private void methodB() {
        int k = 10;
        int m = 20;

    }


    public static void main(String[] args) {
        StackTest s = new StackTest();
        s.methodA();
    }
}
