package CollectionsArray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MethodSort {
    public static void main(String[] args) {
        ArrayList<Integer> list01 = new ArrayList<>();
        Collections.addAll(list01,1,3,2,4);
        System.out.println(list01);
        Collections.sort(list01);
        System.out.println(list01);

        ArrayList<String> list02 = new ArrayList<>();
        Collections.addAll(list02,"a","b","e","d");
        System.out.println(list02);
        Collections.sort(list02);
        System.out.println(list02);

        ArrayList<Person> list03 = new ArrayList<>();
        list03.add(new Person("张三",18));
        list03.add(new Person("王五",25));
        list03.add(new Person("李二",16));
        Collections.sort(list03);
        System.out.println(list03);

        ArrayList<Student> list04 = new ArrayList<>();
        list04.add(new Student("a科比",25));
        list04.add(new Student("詹姆斯",28));
        list04.add(new Student("杜兰特",21));
        list04.add(new Student("b科比",25));
        Collections.sort(list04, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int result = o1.getAge() - o2.getAge();
                if (result == 0){
                    result = o1.getName().charAt(0) - o2.getName().charAt(0);
                }
                return result;
            }
        });
        System.out.println(list04);

    }
}
