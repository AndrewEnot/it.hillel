package ua.exercism.ex14;

import static java.lang.Character.isDigit;

public class IsbnVerifier {

    boolean isValid(String stringToVerify) {
        char[] charArr = stringToVerify.replace("-", "").toCharArray();
        Character[] charArrNew = new Character[charArr.length];
        Integer[] intArr = new Integer[charArr.length];
        int isbn = 0;
        for (int i = 0; i < charArrNew.length; i++) {
            charArrNew[i] = charArr[i];
            if (charArrNew[i] == 'X' && i == charArrNew.length - 1) {
                intArr[i] = 10;
                continue;
            }
            if (isDigit(charArrNew[i])) {
                intArr[i] = Integer.parseInt(String.valueOf(charArr[i]));
                continue;
            }
            return false;
        }
        if (intArr.length == 13) {
            for (int i = 0; i < intArr.length; i++) {
                if (i % 2 == 0) {
                    isbn += charArr[i];
                    continue;
                }
                isbn += charArr[i];
            }
            return isbn % 13 == 0;
        }
        if (intArr.length == 10) {
            for (int i = 0; i < intArr.length; i++) {
                isbn += intArr[i] * (i + 1);
            }
            return isbn % 11 == 0;
        }
        return false;
    }
}
