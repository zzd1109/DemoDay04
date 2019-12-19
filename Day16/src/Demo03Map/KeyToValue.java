package Demo03Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class KeyToValue {
    public static void main(String[] args) {
        show();
    }

    private static void show() {
        Map<Integer,String> map = new HashMap<>();
        map.put(23,"詹姆斯");
        map.put(24,"科比");
        map.put(35,"杜兰特");
        map.put(0,"欧文");
        /*Set<Integer> set = map.keySet();
        for (Integer a:set){
            String value = map.get(a);
            System.out.println(a + "=" + value);
        }
        System.out.println("===============");
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()){
            Integer key = it.next();
            String value = map.get(key);
            System.out.println(key+"="+value);
        }*/
       Set<Map.Entry<Integer,String>> set = map.entrySet();
       /*for (Map.Entry<Integer,String> s:set){
           //System.out.println(s);
           Integer num = s.getKey();
           System.out.println(num);
           String name = s.getValue();
           System.out.println(name);
       }*/
       Iterator<Map.Entry<Integer,String>> it = set.iterator();
       while (it.hasNext()){
           Map.Entry<Integer,String> map1 = it.next();
           Integer key = map1.getKey();
           String value = map1.getValue();
           System.out.println(key+"="+value);
       }

    }
}
