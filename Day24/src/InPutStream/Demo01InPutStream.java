package InPutStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo01InPutStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("Day23\\a.txt");
        /*int len = fis.read();
        System.out.println(len);
        len = fis.read();
        System.out.println(len);
        len = fis.read();
        System.out.println(len);
        len = fis.read();
        System.out.println(len);
        len = fis.read();
        System.out.println(len);*/
        int len = 0;//必须用一个变量来接收数据
        while ((len = fis.read())!=-1){
            System.out.print((char) len);
        }
        fis.close();
    }
}
