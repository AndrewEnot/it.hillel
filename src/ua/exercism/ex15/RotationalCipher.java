package ua.exercism.ex15;

import static java.lang.Character.isLetter;

public class RotationalCipher {

    int shiftKey;

    public static void main(String[] args) {
        RotationalCipher newOne = new RotationalCipher(13);
        System.out.println(newOne.rotate("answer"));

    }

    RotationalCipher(int shiftKey) {
        this.shiftKey = shiftKey;
    }

    String rotate(String data) {
        if (data == null) {
            return "";
        }
        StringBuilder result = new StringBuilder();

        char[] charArr = data.toCharArray();
        Character[] characters = new Character[charArr.length];
        for (int i = 0; i < characters.length; i++) {
            characters[i] = charArr[i];
            if (!isLetter(characters[i])) {
                continue;
            }
            if (charArr[i] <= 90 && charArr[i] >= 65)  {   //BigLetters
                if (charArr[i] + this.shiftKey > 90) {
                    charArr[i] = (char) (charArr[i] - (26 - this.shiftKey));
                } else {
                    charArr[i] += this.shiftKey;
                }
            }
            if (charArr[i] <= 122 && charArr[i] >= 97) {  //SmallLetters
                if (charArr[i] + this.shiftKey > 122) {
                    charArr[i] = (char) (charArr[i] - (26 - this.shiftKey));
                } else {
                    charArr[i] += this.shiftKey;
                }
            }
        }
        for (char c : charArr) {
            result.append(c);
        }
        return result.toString();
    }
}
