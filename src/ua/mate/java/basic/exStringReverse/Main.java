package ua.mate.java.basic.exStringReverse;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] a = {"Don't", "worry", ",", "be", "happy", "!"};
        System.out.println(Arrays.toString(reverse(a)));
    }

    public static String[] reverse(String[] a) {
        // WRITE YOUR CODE BELOW THIS LINE
        StringBuilder str = new StringBuilder();
        String[] result = new String[a.length];
        int j = 0;
        for (String s : a) {
            str.append(s);
        }
        String reversA = str.reverse().toString();
        for (int i = 0; i < a.length; i++) {
            result[i] = reversA.substring(j, j + a[i].length());
            j += a[i].length();
        }
        return result;
        // WRITE YOUR CODE ABOVE THIS LINE
    }
}
