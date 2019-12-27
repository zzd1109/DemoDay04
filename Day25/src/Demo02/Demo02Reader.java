package Demo02;

import java.io.FileReader;
import java.io.IOException;

public class Demo02Reader {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("F:\\ch01\\123.txt");
        /*int len = 0;
        while ((len = fr.read())!= -1){
            System.out.print((char) len);
        }
        fr.close();*/
        char [] cs = new char[1024];
        int len = 0;
        while ((len = fr.read(cs))!=-1){
            System.out.println(new String(cs,0,len));
        }
    }
}
