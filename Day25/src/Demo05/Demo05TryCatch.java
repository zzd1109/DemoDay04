package Demo05;

import java.io.FileWriter;
import java.io.IOException;

public class Demo05TryCatch {
    public static void main(String[] args) {
        FileWriter fw = null;//提高变量的作用域，让finall可以使用
        //变量在定义的时候可以没有初始值，但是使用的时候必须有值
      try {
           fw = new FileWriter("w:\\F:\\ch01\\e.txt",true);
          for (int i = 0; i < 10; i++) {
              fw.write("HelloWorld"+i+"\r\n");

          }

      }catch (IOException e){
          System.out.println(e);

      }finally {
          if (fw!=null){
          try {
              //fw.close方法声明抛出了IOException异常对象，所以我们要处理这个异常对象，要么throws，要么try catch
              fw.close();
          } catch (IOException e) {
              e.printStackTrace();
          }
          }
      }
      }
      }
