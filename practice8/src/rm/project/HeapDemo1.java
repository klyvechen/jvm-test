package rm.project;

public class HeapDemo1 {

    public static void main(String[] args) {
        System.out.println("start....");
        try {
            Thread.sleep(10000000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("end .....");
    }

}
