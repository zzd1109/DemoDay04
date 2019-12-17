package Demo03;

public class GenericMethod {
    public <E> void method01(E e){
        System.out.println(e);
    }
    public static <S> void method02(S s){
        System.out.println(s);
    }
}
