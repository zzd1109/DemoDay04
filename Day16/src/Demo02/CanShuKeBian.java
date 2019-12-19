package Demo02;

public class CanShuKeBian {
    public static void main(String[] args) {
        System.out.println(sum(10,20,30,1000));
        int a = sum(15,16);
        System.out.println(a);
    }
    public static int sum(int ...arr){
        int temp = 0;
        for(int i:arr){
            temp += i;
            //System.out.println(i);
        }
        return temp;
    }
}
