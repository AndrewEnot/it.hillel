package ua.codewars.wprime1;

import java.math.BigDecimal;

public class WilsonPrime {
    public static boolean am_i_wilson(double n) {

        double j = n - 1;

        if (j <= 0) {
            return false;
        }

        int i = 1;
        BigDecimal result = BigDecimal.ONE;
        while (i <= j) {
            result = BigDecimal.valueOf(i).multiply(result);
            i++;
        }
        try {
            BigDecimal upWilson = result.add(BigDecimal.ONE);
            BigDecimal lowWilson = BigDecimal.valueOf(n * n);
            BigDecimal newWilson = upWilson.divide(lowWilson);

            char[] newWilsonArr = newWilson.toString().toCharArray();
            for (int i1 = 0; i1 < newWilsonArr.length; i1++) {
                if (newWilsonArr[i1] == ',') {
                    return false;
                }
            }
        } catch (ArithmeticException e) {
            return false;
        }
        return true;
    }
}


