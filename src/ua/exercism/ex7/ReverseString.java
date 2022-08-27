package ua.exercism.ex7;

class ReverseString {

    String reverse(String inputString) {
        char[] inputStringArr = inputString.toCharArray();
        String inputStringNew = new String();
        for (int i = 0; i < (inputStringArr.length)/2; i++) {
            char temp = inputStringArr[i];
            inputStringArr[i]=inputStringArr[(inputStringArr.length)-(i+1)];
            inputStringArr[inputStringArr.length-(i+1)] = temp;
        }
        for (int i = 0; i < inputStringArr.length; i++) {
            inputStringNew += String.valueOf(inputStringArr[i]);
        }
        return inputStringNew;
    }
}