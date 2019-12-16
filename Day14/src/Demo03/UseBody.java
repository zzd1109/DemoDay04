package Demo03;

public class UseBody {
    public static void main(String[] args) {
        Body body = new Body();
        body.methodBody();
        System.out.println("===============");
        Body.Heart heart = new Body().new Heart();
        heart.beat();
    }
}
