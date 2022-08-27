package ua.hillel.school.hw4;

public class TransformPrEx4 {

    public static void main(String[] args) {
        byte a = 127;
        byte b = a++;

        System.out.println("значення змінної до інкремененту = " + a);
        System.out.println("значення змінної інкременент PostFix = " + b);

    }
}
