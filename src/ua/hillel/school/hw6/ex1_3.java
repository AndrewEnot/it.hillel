package ua.hillel.school.hw6;

import java.util.Arrays;

public class ex1_3 {

    public static void main(String[] args) {
        String[] fruit = new String[5];
        fruit[1] = "banana";
        fruit[2] = "apple";
        fruit[3] = "pineapple";
        fruit[4] = "mango";
        fruit[0] = "plum";

        String[] food = Arrays.copyOf(fruit, fruit.length);

        for (int i = 0; i < fruit.length; i++) {
            System.out.println("fruit: " + fruit [i] + "  ||  food: " + food [i]);
        }
    }
}
