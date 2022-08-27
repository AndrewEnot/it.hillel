package ua.hillel.school.hw6;

import java.sql.SQLOutput;

public class ex4 {

    public static void main(String[] args) {

        int[][] score = new int[3][4];

        int[] result = new int[score.length];

        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                score[i][j] = (i + 1) * 10 + j;
                System.out.println(score[i][j]);
                result[i] += score[i][j];
            }
            System.out.println("сума строки за індексом " + i + " = " + result[i]);
        }
    }
}
     

