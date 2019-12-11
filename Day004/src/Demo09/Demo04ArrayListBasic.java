package Demo09;

import java.util.ArrayList;

import static javax.swing.UIManager.get;

public class Demo04ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<String> listA = new ArrayList<>();
        ArrayList<Integer> listB = new ArrayList<>();
        listB.add(100);
        System.out.println(listB);
        int b = listB.get(0);
        System.out.println(b);
    }
}
