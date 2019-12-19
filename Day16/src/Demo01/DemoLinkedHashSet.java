package Demo01;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class DemoLinkedHashSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("www");
        set.add("abc");
        set.add("abc");
        set.add("hhh");
        System.out.println(set);

        LinkedHashSet<String> linked  = new LinkedHashSet<>();
        linked.add("www");
        linked.add("abc");
        linked.add("abc");
        linked.add("hhh");
        System.out.println(linked);
    }
}
