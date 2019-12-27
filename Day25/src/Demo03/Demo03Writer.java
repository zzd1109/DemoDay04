package Demo03;

import java.io.FileWriter;
import java.io.IOException;

public class Demo03Writer {
    /*public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("F:\\ch01\\d.txt");
        fw.write(97);
        fw.flush();
        fw.close();*/
//字符输出流写数据的其他方法
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("F:\\ch01\\f.txt");
        char [] s = {'a','b','c','d','e'};
        fw.write(s);

        fw.write(s,1,3);

        fw.write("珍林网络");

        fw.write("珍林网络科技",4,2);
        fw.close();

    }
}
