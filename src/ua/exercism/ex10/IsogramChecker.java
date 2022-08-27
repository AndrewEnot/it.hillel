package ua.exercism.ex10;

public class IsogramChecker {

    boolean isIsogram(String phrase) {
        char[] isogram = phrase.replace(" ", "").replace("-","").
                toLowerCase().toCharArray();

        for (char value : isogram) {
            int counter = 0;
            char control = value;
            for (char c : isogram) {
                if (control == c) {
                    counter++;
                }
            }
            if (counter >= 2) {
                return false;
            }
        }
        return true;
    }
}
