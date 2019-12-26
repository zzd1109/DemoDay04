package Demo01;

public class Person {
    private int age;
    private int height;

    public Person() {
    }

    public Person(int age, int height) {
        this.age = age;
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void info(){
        System.out.println("我的年龄是："+age+",我的身高是："+height);
    }

}
