package Demo01;

public class Demo01Main {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.eat();
        Cat cat = (Cat) animal;
        cat.catchMouse();
        //Dog dog = (Dog) animal;错误写法

    }
}
