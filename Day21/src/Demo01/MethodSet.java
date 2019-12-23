package Demo01;

import java.util.*;

public class MethodSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        int sum = 20;
        for (int i = 0; i < sum; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入20个字符串：");
            String s = sc.next();
            set.add(s);
        }
       for (String a:set){
           System.out.println(a);
       }
    }
}
