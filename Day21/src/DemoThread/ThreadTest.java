package DemoThread;

public class ThreadTest {
    public static void main(String[] args) {
        Thread01 t = new Thread01();
        t.start();
        for (int i = 0; i < 20; i++) {
            System.out.println("main:"+i);
        }
    }
}
