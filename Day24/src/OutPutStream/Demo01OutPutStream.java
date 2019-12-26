package OutPutStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01OutPutStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("Day23\\a.txt");
        fos.write(97);
        fos.close();

    }
}
