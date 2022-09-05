package ua.mate.java.basic.exStringNew;

public class LongestWord {

    public static void main(String[] args) {
        System.out.println(findLongest("hhhhhhh  hhhhhhh h hhhh h hh h hhhhhhhhhhh"));
    }

    public static int findLongest(String sentence) {
        // WRITE YOUR CODE BELOW THIS LINE
        int max = 0;
        if (sentence != null) {
            String[] arr = sentence.split(" ");
            for (String s : arr) {
                if (s.length() > max) {
                    max = s.length();
                }
            }
        }
        return max;
        // WRITE YOUR CODE ABOVE THIS LINE
    }
}
