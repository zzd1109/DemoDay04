package CollectionsArray;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MethodAddAll {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"a","b","c","d","e");
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
    }
}
