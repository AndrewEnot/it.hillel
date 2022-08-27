package ua.hillel.school.hw8.ex2;

import java.util.Arrays;

public class Score {

    String category;
    double[] statistic;
    {
        statistic = new double[10];
        Arrays.setAll(statistic, i -> Math.random());
    }
}
