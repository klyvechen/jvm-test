package rm.project;

public class FatherAndSon {

    static class Father {
        public static int A = 1;
        static {
            A = 2;
        }

        public static void showStatic(String msg) {
            System.out.println("Father" + msg);
        }

        public void showCommon(String msg) {
            System.out.println("Father common");
        }
        final public void showFinal() {
            System.out.println("Father final");
        }
    }

    static class Son extends Father {
        public static int B = A;

        public Son() {
            super();
        }

        public Son(int age) {
            this();
        }

        public static void showStatic(String msg) {
            System.out.println("Son" + msg);
        }

        private void showPrivate(String msg) {
            System.out.println("Son private " + msg);
        }

        public void showCommon(String msg) {
            System.out.println("Son common");
        }

        public void show() {

            //invokestatic
            showStatic("hi");

            //invokestatic
            super.showStatic("hi");

            //invokespecial
            showPrivate("hi");

            //invokespecial
            super.showCommon("hi");

            //invokevirtual
            showFinal();

            //invokevirtual
            this.showFinal();

            //invokespecial
            super.showFinal();

            //invokevirtual
            showCommon("hi");

            //invokevirtual
            info();

            MethodInterface m = ()->{};

            //invokeinterface
            m.methodA();
        }

        public void info() {

        }
    }

    public static void main(String[] args) {
        Son son = new Son();
        son.show();
    }

}

interface MethodInterface {
    void methodA();
}
