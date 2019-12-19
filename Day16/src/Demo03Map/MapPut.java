package Demo03Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapPut {
    public static void main(String[] args) {
       show01();
    }

    private static void show01() {
        Map<String,String> map = new HashMap<>();
        map.put("李晨","范冰冰");
        map.put("李晨","范冰冰2");
        String v1 = map.put("李晨","范冰冰3");
        System.out.println("v1:"+v1);
        System.out.println(map);

        map.put("冷锋","龙小云");
        map.put("杨过","小龙女");
        System.out.println(map);
    }
}
