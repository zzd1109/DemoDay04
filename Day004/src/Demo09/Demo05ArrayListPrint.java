package Demo09;

import java.util.ArrayList;

public class Demo05ArrayListPrint {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("kobe");
        list.add("james");
        list.add("durant");
        list.add("curry");
        System.out.println(list);
        printArrayList(list);
    }
    public static void printArrayList(ArrayList<String> list){
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if(i == list.size()-1){
                System.out.println("}");
            }else {
                System.out.print("@");
            }
        }
    }
}
