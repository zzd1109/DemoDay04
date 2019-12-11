package Demo09;

import java.util.ArrayList;

public class Demo03ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);
        list.add("kobe");
        System.out.println(list);
        boolean success = list.add("kobe");
        System.out.println("添加的动作是否成功"+success);
        list.add("james");
        list.add("paul");
        list.add("harden");
        list.add("durant");
        list.add("curry");
        System.out.println(list);
        String name = list.get(2);
        System.out.println(name);
        String who = list.remove(3);
        System.out.println("被删除的是："+who);
        System.out.println(list);
        int size = list.size();
        System.out.println("集合的长度是："+size);
    }
}
