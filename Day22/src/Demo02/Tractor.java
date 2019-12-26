package Demo02;

public class Tractor extends Car {
    @Override
    public void run(String brand, String color) {
        System.out.println(color+"的"+brand+"在奔跑");
    }

}
