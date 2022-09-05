package ua.mate.java.basic.exMN;

public class Main {
    public static void main(String[] args) {
        System.out.println(isEqually(null));
    }

    public static boolean isEqually(String str) {
        // WRITE YOUR CODE BELOW THIS LINE
        int n = 0;
        int m = 0;
        if (str == null) {
           return false;
        }
        char[] arr = str.toLowerCase().toCharArray();
        for (char c : arr) {
            if (c == 'n') {
                n += 1;
            } else if (c == 'm') {
                m += 1;
            }
        }
        return n == m;
        // WRITE YOUR CODE ABOVE THIS LINE
    }
}
