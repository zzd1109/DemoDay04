package Demo03Map;

import java.util.HashMap;
import java.util.Map;

public class MapRemove {
    public static void main(String[] args) {
        show02();
    }

    private static void show02() {
        Map<String,Integer> map = new HashMap<>();
        map.put("赵丽颖",160);
        map.put("杨颖",168);
        map.put("林志玲",178);
        Integer v1 = map.remove("林志玲");
        System.out.println(v1);
        System.out.println(map);
        Integer v2 = map.remove("林志颖");
        System.out.println(v2);
        System.out.println(map);
        Integer v3 =map.get("杨颖");
        System.out.println("v3:"+v3);
        Integer v4 = map.get("迪丽热巴");
        System.out.println("v4:"+v4);
    }
}
