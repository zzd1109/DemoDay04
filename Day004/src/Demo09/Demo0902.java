package Demo09;

import java.util.Random;
import java.util.Scanner;

public class Demo0902 {
    public static void main(String[] args) {
        Random r = new Random();
        int num1 = r.nextInt(100);
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("请输入你猜测的数字：");
            int num2 = sc.nextInt();
        if (num2 > num1){
            System.out.println("输入的数字太大了，请重试！");
        }else if(num2 < num1){
            System.out.println("输入的数字太小了，请重试！");
        }else{
            System.out.println("恭喜你，猜对了！");
            break;
        }
        }
        System.out.println("游戏结束！");
    }
}
