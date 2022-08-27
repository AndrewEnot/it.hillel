package ua.hillel.school.hw9.ex1;

public class Test {

    public static void main(String[] args) {

        int ai = 12;
        int bi = 6;
        double ad = 10.5;
        double bd = 5.5;

        System.out.println("Розрахунок типових калькуляцій для чисел з типом данних int!!!");
        System.out.println(" a = " + ai);
        System.out.println(" b = " + bi);
        System.out.println("Сума = " + CalcMethods.Add(ai, bi));
        System.out.println("Віднімання = " + CalcMethods.Sub(ai, bi));
        System.out.println("Множення = " + CalcMethods.Mul(ai, bi));
        System.out.println("Ділення = " + CalcMethods.Div(ai, bi));
        System.out.println(" ");
        System.out.println("Розрахунок типових калькуляцій для чисел з типом данних double!!!");
        System.out.println(" a = " + ad);
        System.out.println(" b = " + bd);
        System.out.println("Сума = " + CalcMethods.Add(ad, bd));
        System.out.println("Віднімання = " + CalcMethods.Sub(ad, bd));
        System.out.println("Множення = " + CalcMethods.Mul(ad, bd));
        System.out.println("Ділення = " + CalcMethods.Div(ad, bd));
    }
}
