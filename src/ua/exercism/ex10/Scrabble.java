package ua.exercism.ex10;

public class Scrabble {

    String word;

    Scrabble(String word) {
        this.word = word;
    }

    int getScore() {
        char[] arr = this.word.toUpperCase().toCharArray();
        int summ = 0;
        for (char c : arr) {
            switch (c) {
                case 'A', 'E', 'I', 'O', 'U', 'L', 'N', 'R', 'S', 'T' -> summ += 1;
                case 'D', 'G' -> summ += 2;
                case 'B', 'C', 'M', 'P' -> summ += 3;
                case 'F', 'H', 'V', 'W', 'Y' -> summ += 4;
                case 'K' -> summ += 5;
                case 'J', 'X' -> summ += 8;
                case 'Q', 'Z' -> summ += 10;
                default -> {
                }
            }
        }
        return  summ;
    }
}
