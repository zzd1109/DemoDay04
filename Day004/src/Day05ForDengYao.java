public class Day05ForDengYao {
    public static void main(String[] args) {
        int max = 5;
        for(int i = 1;i<=5;i++){
           for (int j = 1;j<=max-i;j++){
               System.out.println(" ");
               for (int k=1;k <= 2*i-1;k++){
                   System.out.println("*");
                   System.out.println();

               }
           }
        }
    }
}
