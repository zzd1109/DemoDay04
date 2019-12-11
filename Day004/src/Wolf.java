public class Wolf extends Animal {
    public Wolf(){
        super("灰太狼",3);
        System.out.println("Wolf无参数的构造器");
    }

    public static void main(String[] args) {
        Wolf w = new Wolf();
    }
}

