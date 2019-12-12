package Demo09;

import java.util.ArrayList;
import java.util.Random;

public class Demo01ArrayListRandom {
    public static void main(String[] args) {
        ArrayList<Integer> listA = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 6; i++) {
            int num = r.nextInt(33)+1;
            listA.add(num);
        }
        for (int i = 0; i < listA.size(); i++) {
            System.out.println(listA.get(i));
        }
    }

}
