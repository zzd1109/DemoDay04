package Demo04;

public class Test99 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = i ;j <= 9; j++) {
                int sum = i * j;
                System.out.println(i +"*"+j+"="+"="+sum+"\t");
            }
            System.out.println();
        }

    }
}
