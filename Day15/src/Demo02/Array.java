package Demo02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Array {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        System.out.println(coll);
        coll.add("张三");
        coll.add("李四");
        coll.add("王五");
        coll.add("赵六");
        System.out.println(coll);
        boolean b1 = coll.remove("王五");
        System.out.println("b1:"+b1);
        boolean b2 = coll.remove("王七");
        System.out.println("b2:"+b2);
        System.out.println(coll);
        boolean b3 = coll.contains("张三");
        System.out.println("b3:"+b3);
        boolean b4 = coll.contains("李三");
        System.out.println("b4:"+b4);
        boolean b5 = coll.isEmpty();
        System.out.println("b5:"+b5);
        int b6 = coll.size();
        System.out.println("集合中的元素个数："+b6);
        Object [] arr = coll.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        coll.clear();
        System.out.println(coll);
        boolean b = coll.isEmpty();
        System.out.println("b:"+b);
    }
}
