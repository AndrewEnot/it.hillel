package ua.mate.java.basic.exPractice;

public class Main {
    public static void main(String[] args) {
        int[] ints = {4, 6, 2, 12, 8, 40, 22, 32, 16, 32};

        System.out.println(getDivisibleNumbers(ints, 2));
    }

    public static String getMiddleString(String originalString) {
        // write your code below this line
        String middleString = new String();
        if (originalString.length() != 0) {
            if (originalString.length()%2 == 0) {
                middleString = originalString.substring((originalString.length() / 2 - 1),
                        (originalString.length() / 2 + 1));
            } else {
                middleString = String.valueOf(originalString.charAt((originalString.length()/2)));
            }
            return middleString;
        }
        return "";
        // write your code above this line
    }

    public static String[] markStringEnds(String originalString) {
        // write your code below this line
        StringBuilder first = new StringBuilder();
        StringBuilder second = new StringBuilder();

        char[] firstArr = originalString.toCharArray();
        char[] secondArr = firstArr;

        for (int  i = 0; i < firstArr.length; i++) {
            if (i == 0) {
                String firstLit = String.valueOf(firstArr[i]);
                first.append(firstLit.toUpperCase());
                continue;
            }
            first.append(firstArr[i]);
        }
        for (int  i = 0; i < secondArr.length; i++) {
            if (i == secondArr.length - 1) {
                String secondLit = String.valueOf(secondArr[i]);
                second.append(secondLit.toUpperCase());
                continue;
            }
            second.append(secondArr[i]);
        }

        return new String[]{first.toString(),second.toString()};
        // write your code above this line
    }

    public static int[] getDivisibleNumbers(int[] numbers, int divider) {
        //write your code below this line
        int size = 0;
        int j = 0;

        if (divider == 0) {
            return new int[]{0};
        }

        for (int number : numbers){
            if (number%divider == 0 && number > 0) {
                size++;
            }
        }
        int[] divNumber = new int[size];

        for (int number : numbers){
            if (number%divider == 0 && number > 0) {
                divNumber[j] = number;
                j++;
            }
        }
        return divNumber;
        //write your code above this line
    }
}
