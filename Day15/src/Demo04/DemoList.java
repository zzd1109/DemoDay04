package Demo04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("a");
        System.out.println(list);
        list.add(3,"it");
        System.out.println(list);
        String remove = list.remove(2);
        System.out.println(remove);

        String setRemove = list.set(4,"A");
        System.out.println(setRemove);
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("===============");
       Iterator<String> it = list.iterator();
       while (it.hasNext()){
           String s = it.next();
           System.out.println(s);
       }
        System.out.println("===========");
       for(String c : list){
           System.out.println(c);
       }
    }
}
