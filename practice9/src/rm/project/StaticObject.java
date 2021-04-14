package rm.project;


public class StaticObject {
    static class Test {
        static ObjectHolder staticHolder = new ObjectHolder();
        ObjectHolder instanceHolder = new ObjectHolder();

        void foo() {
            ObjectHolder localHolder = new ObjectHolder();
            System.out.println("done");
        }
    }


}

class ObjectHolder {

}