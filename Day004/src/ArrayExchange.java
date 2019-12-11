public class ArrayExchange {
    public static void main(String[] args) {
        int[] arrayA = {1, 2, 3, 4};
        for (int i = 0; i < arrayA.length; i++) {
            System.out.println(arrayA[i]);
        }
        for(int min = 0,max = arrayA.length-1;min < max;min++,max--){
            int temp = arrayA[min] ;
            arrayA[min] = arrayA[max];
            arrayA[max] = temp;
        }
        for (int i = 0; i < arrayA.length; i++) {
            System.out.println(arrayA[i]);}
}
}
