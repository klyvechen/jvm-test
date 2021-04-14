package rm.project;

public class DeadThreadTest {

    public static void main(String[] args) {
        Runnable r = ()-> {
            System.out.println(Thread.currentThread().getName() + "開始");
            DeadThread deadThread = new DeadThread();
            System.out.println(Thread.currentThread().getName() + "結束");
        };

        Thread t1 = new Thread(r, "t1");
        Thread t2 = new Thread(r, "t2");
        t1.start();
        t2.start();
    }


}

class DeadThread {
    static {
        if (true) {
            System.out.println(Thread.currentThread().getName() + "類當前初始化");
//            while (true) {}
        }

    }
}
