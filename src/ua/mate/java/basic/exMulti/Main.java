package ua.mate.java.basic.exMulti;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findMultiples(3, 4)));
    }

    public static int[] findMultiples(int x, int n) {
        // WRITE YOUR CODE BELOW THIS LINE
        int[] arr = new int[x];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = n * (i + 1);
        }
        return arr;
        // WRITE YOUR CODE ABOVE THIS LINE
    }
}
