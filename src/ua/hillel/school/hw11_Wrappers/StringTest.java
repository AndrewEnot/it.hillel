package ua.hillel.school.hw11_Wrappers;

import java.util.Scanner;

public class StringTest {

    public static void main(String[] args) {

        //Завдання 2
        System.out.println("Exercise 2:");
        String aString1 = "Literal";
        String aString2 = new String("newString");
        char[] aString3 = {'A', 'r', 'r', 'a', 'y'};
        String aString3_1 = new String(aString3);
        byte[] aByte1 = {42, 79, 74, 65};
        String aString4 = new String(aByte1);
        StringBuilder aString6_1 = new StringBuilder();
        aString6_1.append("String")
                .append("Builder");
        String aString6 = aString6_1.toString();
        System.out.println(" " + aString1 + " - " + aString2 + " - " + aString3_1 + " - " + aString4 + " - " + aString6);

        //Завдання 3
        System.out.println("Exercise 3:");

        String aString7 = "Orange,Apple,Garnet,Pear";
        String[] aString8 = aString7.split(",");

        //сортуємо масив по довжині слів (від самого довгого до короткого)
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < aString8.length - 1; i++) {
                if (aString8[i].length() < aString8[i + 1].length()) {
                    String temp = aString8[i];
                    aString8[i] = aString8[i + 1];
                    aString8[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        //елемент масиву за індексом '0' буде самим довгим, для подальшої роботи ініціалізуємо його в окремий обьект
        String aString8_1 = aString8[0].toLowerCase();
        System.out.println(" " + aString8_1);
        aString8_1 = aString8_1.substring(0, 3);
        System.out.println(" " + aString8_1);

        String aString9 = " I'm_new_string  ";
        aString9 = aString9.trim();
        aString9 = aString9.replace('_', ' ');
        System.out.println(" " + aString9);

        //робота з класом StringBuilder
        System.out.println("\nStringBuilder");
        StringBuilder allStrings = new StringBuilder();
        allStrings.append(aString1).append(aString2).append(aString3).append("\n")
                .append(aString6).append(aString7).append(aString9).append("\n");
        allStrings = allStrings.reverse();
        String allStrings_1 = allStrings.toString();
        System.out.println(allStrings_1);

        //Scanner
        System.out.println("Scanner");
        runScanner();
    }
    public static void runScanner() {
        boolean isWorking = true;
        while (isWorking) {
            Scanner textIn = new Scanner(System.in);
            System.out.print("Input a command... ");
            String text = textIn.next();
            System.out.println("You have entered: " + text);
            switch (text.toLowerCase().trim()) {
                case "run" -> System.out.println("    Running...");
                case "finish" -> {
                    System.out.println("    Finished!");
                    isWorking = false;
                }
                case "error" -> System.out.println("    Error!!!");
                default -> System.out.println("    Unknown command!!!");
            }
        }
    }
}
