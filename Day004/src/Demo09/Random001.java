package Demo09;

import java.util.Random;

public class Random001 {
    public static void main(String[] args) {
        int n = 100 ;
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            int temp = r.nextInt(n)+1;
            System.out.println(temp);
        }
    }
}
