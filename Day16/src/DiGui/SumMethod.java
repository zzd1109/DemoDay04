package DiGui;

public class SumMethod {
    public static void main(String[] args) {
        int result = sum(100);
        System.out.println(result);
    }
    public static int sum(int i){
        if (i == 1){
            return 1;
        }
        return i + sum(i-1);
    }
}
