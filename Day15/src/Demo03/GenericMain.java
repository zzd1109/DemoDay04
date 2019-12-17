package Demo03;

public class GenericMain {
    public static void main(String[] args) {
        Generic gc = new Generic();
        gc.setName("只能是字符串");


        Generic<Integer> gc2 = new Generic<>();
        gc2.setName(1);
        Integer name = gc2.getName();
        System.out.println(name);

        Generic<String> gc3 = new Generic<>();
        gc3.setName("小苗");
        String name2 = gc3.getName();
        System.out.println(name2);
    }
}
