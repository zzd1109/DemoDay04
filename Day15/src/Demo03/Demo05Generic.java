package Demo03;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo05Generic {
    public static void main(String[] args) {
        ArrayList<String> list01 = new ArrayList<>();
        list01.add("a");
        list01.add("b");
        printArray(list01);
        ArrayList<Integer> list02 = new ArrayList<>();
        list02.add(1);
        list02.add(2);
        printArray(list02);

    }
    public static void printArray(ArrayList<?> list){
        Iterator<?> it = list.iterator();
        while (it.hasNext()){
            Object o = it.next();
            System.out.println(o);
        }
    }
}
