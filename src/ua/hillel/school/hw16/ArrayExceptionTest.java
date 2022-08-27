package ua.hillel.school.hw16;

import java.util.Arrays;

public class ArrayExceptionTest {


    public static void main(String[] args) {
        int[] newInt = {1,2,3,4,5,6,7,8,9,10};

        try {
            printArray(newInt, 1, 7);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: not existing index!!!");
            System.out.println("Array length: " + newInt.length);
        }
    }

    static void printArray(int[] arr, int startIndex, int endIndex) {
        if (startIndex < 0 ) {
            System.out.println("low index : " + startIndex);
            throw new ArrayIndexOutOfBoundsException();
        }
        if (endIndex < 0 ) {
            System.out.println("low index : " + endIndex);
            throw new ArrayIndexOutOfBoundsException();
        }
        if (startIndex > arr.length) {
            System.out.println("High index : " + startIndex);
            throw new ArrayIndexOutOfBoundsException();
        }
        if (endIndex > arr.length) {
            System.out.println("High index : " + endIndex);
            throw new ArrayIndexOutOfBoundsException();
        }
        int[] arrCut = Arrays.copyOfRange(arr, startIndex, endIndex);
        System.out.println(Arrays.toString(arrCut));

    }
}
