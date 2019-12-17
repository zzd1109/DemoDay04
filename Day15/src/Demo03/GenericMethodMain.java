package Demo03;

public class GenericMethodMain {
    public static void main(String[] args) {
        GenericMethod gc = new GenericMethod();
        gc.method01(10);
        gc.method01("kobe");
        gc.method01(8.8);
        gc.method01(true);
        gc.method02("静态方法");
        GenericMethod.method02("静态方法");
        GenericMethod.method02(1);
    }
}
