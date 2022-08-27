package ua.exercism.ex11;

import static java.lang.Character.*;

public class SqueakyClean {

    public static void main(String[] args) {
        System.out.println(clean("my\0\r\u007FId"));
    }

    static String clean(String identifier) {
        StringBuilder result = new StringBuilder();

        char[] clean = identifier.toCharArray();
        Character[] cleanArr = new Character[clean.length];
        for (int i = 0; i < clean.length; i++) {
            cleanArr[i] = clean[i];
            if (isWhitespace(cleanArr[i])) {
                cleanArr[i] = '_';
                result.append(cleanArr[i]);
                continue;
            }
            if (clean[i] >= 945 && clean[i] <= 969) {
                continue;
            }
            if (i > 0) {
                if (cleanArr[i - 1].equals('-')) {
                    cleanArr[i] = Character.toUpperCase(cleanArr[i]);
                }
            }
            if (isISOControl(cleanArr[i])) {
                result.append("CTRL");
                continue;
            }
            if (!isLetter(cleanArr[i])) {
                continue;
            }
            result.append(cleanArr[i]);
        }
        return result.toString();
    }
}
