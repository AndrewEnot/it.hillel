package ua.hillel.school.hw8.ex2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < GlobalRating.data.length; i++) {
            System.out.println(GlobalRating.data[i].category + " "
                    + Arrays.toString(GlobalRating.data[i].statistic));
        }
    }
}
