package Demo01;

import java.util.Scanner;

public class Demo009 {
    public boolean isSame(int a){
        if(a < 0){
            return false;
        }
        int num = 0;
        int x = a;
        while(a!=0){
            num = a%10 + num*10;
            a/=10;
        }
        return true;
        }

    public static void main(String[] args) {
        Demo009 d = new Demo009();
        d.isSame(-111);
    }
    }
