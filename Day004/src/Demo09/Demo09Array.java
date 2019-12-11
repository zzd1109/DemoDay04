package Demo09;

public class Demo09Array {
    public static void main(String[] args) {
        Person [] array = new Person [3];
        Person one = new Person("迪丽热巴",18);
        Person two = new Person("古力拉扎",28);
        Person three = new Person("赵丽颖",25);

        array[0] = one;
        array[1] = two;
        array[2] = three;

        System.out.println(array[0].getAge());

    }
}
