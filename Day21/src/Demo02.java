import java.util.Collections;
import java.util.HashMap;

public class Demo02 {
    public static void main(String[] args) {
        String [] arr = {"a","b","a","b","c","a","b","c","b"};
        HashMap<String,Integer> map = new HashMap<>();
        for(String it : arr){
            if (map.containsKey(it)){
                Integer value = map.get(it);
                value++;
                map.put(it,value);
            }else{
                map.put(it,1);
            }
        }
        for ( String key : map.keySet()){
            Integer value = map.get(key);
            System.out.println(key+"="+value);
        }
    }
}