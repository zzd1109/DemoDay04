package Demo03;

public class GenericInterfaceMain implements GenericInterface<String> {
    @Override
    public void method(String s) {
        System.out.println(s);
    }
}
