package Demo08;

import java.util.Scanner;

public class Demo01ScannerMax {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        System.out.println("请输入第一个值");
        int a = m.nextInt();
        System.out.println("请输入第二个值");
        int b = m.nextInt();
        System.out.println("请输入第三个值");
        int c = m.nextInt();
        int temp = a > b ? a : b;
        int max = temp > c ? temp : c;
        System.out.println("最大值是："+max);
    }
}
