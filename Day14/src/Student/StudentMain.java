package Student;

public class StudentMain {
    public static void main(String[] args) {
        Student1 stu1 = new Student1();
        stu1.setName("kobe");
        stu1.setAge(35);
        stu1.setPhone("15385852670");
        System.out.println("姓名"+stu1.getName()+"年龄"+stu1.getAge()+"电话"+stu1.getPhone());

    }
}
