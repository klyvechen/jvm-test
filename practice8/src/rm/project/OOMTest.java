package rm.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class OOMTest {

    public static void main(String[] args) {
        List<Picture> pictureList = new ArrayList<>();
        while (true) {
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            pictureList.add(new Picture(new Random().nextInt(1024 * 1024)));
        }
    }

}

class Picture {

    private byte[] pixel;

    public Picture(int b) {
        pixel = new byte[b];
    }
}
