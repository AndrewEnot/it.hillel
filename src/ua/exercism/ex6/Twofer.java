package ua.exercism.ex6;

public class Twofer {

    public static String twofer(String name) {

        if (name == null) {
            return "One for you, one for me";
        } else {
            return "One for " + name + ", one for me";
        }
    }
}
