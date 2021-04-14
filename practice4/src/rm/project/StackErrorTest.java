package rm.project;

/**
 *
 * 默認情況下 10821
 * 設置了棧的大小 1872
 *
 */
public class StackErrorTest {

    private static int count = 1;

    public static void main(String[] args) {
        System.out.println(count);
        count++;
        main(args);
    }

}
