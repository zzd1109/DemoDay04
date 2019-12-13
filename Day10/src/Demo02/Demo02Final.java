package Demo02;

public class Demo02Final {
    public static void main(String[] args) {
        int num1 = 10;
        System.out.println(num1);
        num1 = 20;
        System.out.println(num1);
        final int num2 = 200;
        System.out.println(num2);
        //num2 = 250;//错误写法
        final int num3;
        num3 = 30;
    }
}
