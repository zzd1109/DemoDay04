package Demo01;

public class Main {
    public static void main(String[] args) {
        Shape s1 = new Triangle("黑色",3,4,5);
        System.out.println(s1.getType());
        System.out.println(s1.calPerimeter());
        System.out.println(s1.getColor());
    }
}
