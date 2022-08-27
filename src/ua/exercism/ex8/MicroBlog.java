package ua.exercism.ex8;

import java.util.Arrays;

class MicroBlog {
    public String truncate(String input) {
        int[] inputArr = input.codePoints().toArray();
        int[] inputNew;
        StringBuilder inputLast = new StringBuilder();

        if (inputArr.length > 5) {
            inputNew = Arrays.copyOfRange(inputArr, 0, 5);
            for (int i = 0; i < inputNew.length; i++) {
                inputLast.append(Character.toString(inputNew[i]));
            }
             return inputLast.toString();
        } else {
            return input;
        }
    }
}