package Demo03Filter;

import java.io.File;

public class FilterMethod {
    public static void main(String[] args) {
        File file = new File("c:\\abc");
       getAllFile(file);
    }
    public static void getAllFile(File dir){
        System.out.println(dir);
        File[] files = dir.listFiles(new FileFilterImpl());
        for (File f : files){
            if(f.isDirectory()){
                getAllFile(f);
            }else{
                System.out.println(f);
            }
        }
    }
}
