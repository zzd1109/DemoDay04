import java.util.jar.JarOutputStream;

public class Ostrich extends Bird {
    @Override//重写
    public void fly() {
        System.out.println("我只能在地上跑");
    }

    public static void main(String[] args) {
        Ostrich o = new Ostrich();
        o.fly();
    }
}
