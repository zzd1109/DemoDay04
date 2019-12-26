

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertirsUse {
    private static void show02() throws IOException {
        Properties prop = new Properties();
        prop.setProperty("赵丽颖","168");
        prop.setProperty("迪丽热巴","165");
        prop.setProperty("古力拉扎","160");

        FileWriter fw = new FileWriter("F:\\ch01");
        prop.store(fw,"save");
    }

    public static void main(String[] args) throws IOException {
        show02();
    }
}
