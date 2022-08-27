package ua.mate.java.basic.exArr;

public class Main {

    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,4,5,6,};
        getDoublePower(numbers);

    }

    public static int[] getDoublePower(int[] powers) {
        //Write code below this line
        for (int i = 0; i < powers.length; i++) {
         powers[i] *= 2;
        }
        return powers;
        //Write code above this line
    }

}
