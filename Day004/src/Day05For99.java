public class Day05For99 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9;i++){
            for(int j = 1; j<=i ;j++) {
                int sum = i * j;
                System.out.println(i+"*"+j+"="+sum+"\t");
            }
            System.out.println();
        }
    }
}
