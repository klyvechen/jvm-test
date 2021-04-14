package rm.project;

import java.util.ArrayList;
import java.util.List;

/**
 * -Xmx9, -Xms9m, -XX:+PrintGCDetails
 */
public class GCTest {
    public static void main(String[] args) {
//      [PSYoungGen: 1987K->496K(2560K)] 1987K->684K(9728K), 0.0008372 secs]
//      1987K
        int i = 0;
        List<String> list = new ArrayList<>();
        String a = "rm";

        while (true) {
            list.add(a);
            a = a+a;
            i++;
        }
    }
}
