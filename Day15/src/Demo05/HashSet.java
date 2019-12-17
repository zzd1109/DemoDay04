package Demo05;

import java.util.Iterator;
import java.util.Set;

public class HashSet {
    public static void main(String[] args) {
        Set<Integer> set = new java.util.HashSet<>();
        set.add(1);
        set.add(3);
        set.add(2);
        set.add(1);
        set.add(4);
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
            Integer s = it.next();
            System.out.println(s);
        }
        System.out.println("==============");
        for (Integer is:set){
            System.out.println(is);
        }


    }
}
