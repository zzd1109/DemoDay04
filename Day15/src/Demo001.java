import java.lang.reflect.Method;

public class Demo001 {
    public static void main(String[] args) {
        int array[] = new int[]{2, 7, 11, 15};
        int target =13;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == target) {
                    System.out.println("数组下标是："+i+","+j);
                }
            }
        }
    }
}