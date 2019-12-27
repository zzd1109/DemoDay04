package Demo01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DemoCopyFile {
    public static void main(String[] args) throws IOException {
        long s = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("C:\\001\\123.txt");
        FileOutputStream fos = new FileOutputStream("C:\\002\\123.txt");
        /*int len = 0;
        while ((len = fis.read())!=-1){
            fos.write(len);
        }*/

        byte[] bytes = new byte[1024];
        int len = 0;
        while((len = fis.read())!=-1){
            fos.write(bytes,0,len);
        }
        fos.close();
        fis.close();
        long e = System.currentTimeMillis();
        System.out.println("复制文件共耗时："+(e - s)+"毫秒");
    }
}
