package ua.exercism.ex12;


public class Proverb {

    public static void main(String[] args) {
        String[] one = {"nail", "shoe", "horse"};
        new Proverb (one).recite();

    }

    String[] words;

    Proverb(String[] words) {
        this.words = words;
    }

    void recite() {
        StringBuilder result = new StringBuilder();
        if (words.length == 0) {
            System.out.println("");
        }
        if (words.length > 1) {
            for (int i = 1; i < words.length; i++) {
                result.append("For want of a ").append(words[i - 1]).append(" the ").append(words[i])
                        .append(" was lost.\n");
            }
        }
        result.append("And all for the want of a ").append(words[0]).append(".");
        System.out.println(result);
    }
}
