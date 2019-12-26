package ReflectDemo03;

import java.lang.reflect.Constructor;

public class CreateJFrame {
    public static void main(String[] args) throws Exception {
        Class<?> jframe = Class.forName("javax.swing.JFrame");
        Constructor ctor = jframe.getConstructor(String.class);
        Object obj = ctor.newInstance("测试窗口");
        System.out.println(obj);

    }
}
