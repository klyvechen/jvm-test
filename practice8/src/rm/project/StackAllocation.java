package rm.project;

public class StackAllocation {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            alloc();
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);

        try {
            Thread.sleep(100000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void alloc() {
        User u = new User();
        u.id = 0;
        u.name = "name";

    }

    static class User {
        int id;
        String name;
    }
}
