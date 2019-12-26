package OutPutStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Demo02OutPutStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream(new File("Day23\\b.txt"));
        fos.write(49);
        fos.write(48);
        fos.write(48);
        byte[] bytes = {65,66,67,68,69};
        //byte[] bytes = {-65,-66,-67,68,69};
        fos.write(bytes);

        fos.write(bytes,1,2);

        byte[] bytes1 = "你好".getBytes();
        System.out.println(Arrays.toString(bytes1));
        fos.write(bytes1);
        fos.close();
    }
}
