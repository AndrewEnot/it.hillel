package ua.mate.java.basic.exString;

public class Main {

    public static void main(String[] args) {
        System.out.println(makeAbbr("national aeronautics space administration"));
    }

    public static String makeAbbr(String fullName) {
        // write your code below this line
        StringBuilder abbr = new StringBuilder();
        String[] strings = fullName.split(" ");
        for (int i = 0; i < strings.length; i++) {
            abbr.append(strings[i].charAt(0));
        }
        return abbr.toString().toUpperCase();
        // write your code above this line
    }

}
