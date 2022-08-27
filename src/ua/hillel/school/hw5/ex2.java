package ua.hillel.school.hw5;

public class ex2 {

    public static void main(String[] args) {

        int mlNumber = 1;

        for (int i = 1; i<101; i++ ) {

            mlNumber *= i;

            if (mlNumber >= 1000) {

                System.out.println(mlNumber);
                return;

            }
        }
    }
}
