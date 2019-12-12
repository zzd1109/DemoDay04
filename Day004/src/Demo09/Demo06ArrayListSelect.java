package Demo09;

import com.sun.org.apache.xpath.internal.objects.XObject;

import java.util.ArrayList;
import java.util.Random;

public class Demo06ArrayListSelect {
    public static void main(String[] args) {
        ArrayList<Integer> bigList = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            int num = r.nextInt(100)+1;
            bigList.add(num);
        }
        ArrayList<Integer> smallList = getSmallList(bigList);
    }
    public static ArrayList getSmallList (ArrayList<Integer> bigList){
        ArrayList<Integer> smallList = new ArrayList<>();
        for (int i = 0; i < bigList.size(); i++) {
            int num = bigList.get(i);
            if (num % 2 == 0){
                smallList.add(num);
            }
        }
        return smallList;
    }
}
