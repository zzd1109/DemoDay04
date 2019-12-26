package Demo01;

public class ReferenceArrayTest {
    public static void main(String[] args) {
        Person [] students ;
        students = new Person[2];
        Person zhang = new Person();
        zhang.setAge(15);
        zhang.setHeight(158);
        Person lee = new Person();
        lee.setAge(16);
        lee.setHeight(161);
        students[0] = zhang;
        students[1] = lee;
        lee.info();
        students[0].info();
    }
}
