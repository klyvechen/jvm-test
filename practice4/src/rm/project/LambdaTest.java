package rm.project;

/**
 *
 */
interface Func {
    boolean fun(String str);
}

public class LambdaTest {

    public void lambda(Func func) {
        return;
    }

    public static void main(String[] args) {

        LambdaTest lambdaTest = new LambdaTest();

        Func func = s->{
            return true;
        };

        lambdaTest.lambda(func);

        lambdaTest.lambda(a->{return false;});

    }

}
