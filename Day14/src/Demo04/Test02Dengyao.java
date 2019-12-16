package Demo04;

public class Test02Dengyao {
    public static void main(String[] args) {
        int max = 4;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= max -1;j++ ) {
                System.out.println(" ");
                for (int k = 1; k < 2 * i - 1; k++) {
                    System.out.println("*");
                    System.out.println();
                }
            }
        }
    }
}
