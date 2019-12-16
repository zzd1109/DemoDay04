package Student;

public class Student1 {
    private String name;
    private int age;
    private String phone;

    public Student1() {
    }

    public Student1(String name, int age, String phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void eat(){
        System.out.println("吃东西");
    }
    public void play(){
        System.out.println("玩耍");
    }
}
