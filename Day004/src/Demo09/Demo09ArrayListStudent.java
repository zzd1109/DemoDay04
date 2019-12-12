package Demo09;

import java.util.ArrayList;

public class Demo09ArrayListStudent {
    public static void main(String[] args) {
        ArrayList<Student> listA = new ArrayList<>();
        Student one = new Student("kobe",35);
        Student two = new Student("james",32);
        Student three = new Student("paul",28);
        Student four = new Student("durant",29);

        listA.add(one);
        listA.add(two);
        listA.add(three);
        listA.add(four);
        for (int i = 0; i < listA.size(); i++) {
            Student stu = listA.get(i);
            System.out.println("姓名"+stu.getName()+",年龄"+stu.getAge());
        }
    }
}
