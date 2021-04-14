package rm.project;

/**
 *
 */
public class DynamicLinkingTest {

    public static void main(String[] args) {

    }

    int num;

    public void methodA() {
        System.out.println("調用methodA.....");

    }

    public void methodB() {
        System.out.println("調用methodB.....");
        methodA();
        num++;

    }
}
