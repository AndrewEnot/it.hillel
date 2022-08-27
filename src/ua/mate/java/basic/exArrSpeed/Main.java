package ua.mate.java.basic.exArrSpeed;

public class Main {
    public static void main(String[] args) {
        getSpeedStatistic(null);
    }
    public static int[] getSpeedStatistic(int[] results) {
        //Write code below this line
        if (results == null) {
            int[] resultsNull = new int [1];
            results = resultsNull;
        }
        int maxSpeed = results[0];
        int minSpeed = results[0];
        int[] resultsNew = new int[2];

        for (int i = 0; i < results.length; i++) {
            if (maxSpeed <= results[i]){
                maxSpeed = results[i];
            }
            if (minSpeed >= results[i]){
                minSpeed = results[i];
            }
        }

        resultsNew[0] = minSpeed;
        resultsNew[1] = maxSpeed;

        return resultsNew;
        //Write code above this line
    }

}


