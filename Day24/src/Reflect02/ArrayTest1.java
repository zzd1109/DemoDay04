package Reflect02;

import java.lang.reflect.Array;

public class ArrayTest1 {
    public static void main(String[] args) {
        Object arr = Array.newInstance(String.class,10);
        Array.set(arr,5,"疯狂讲义");
        Array.set(arr,6,"轻量级javaee");
        Object book1 = Array.get(arr,5);
        Object book2 = Array.get(arr,6);
        System.out.println(book1);
        System.out.println(book2);
    }
}
