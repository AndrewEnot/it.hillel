package ua.hillel.school.hw4;

public class TransformPrEx23 {

    public static void main(String[] args) {

        Transform upperTransform = new Transform();  //byte->short->int->long

        upperTransform.byteNumber = 126;
        upperTransform.shortNumber = upperTransform.byteNumber;
        upperTransform.intNumber = upperTransform.shortNumber;
        upperTransform.longNumber = upperTransform.intNumber;

        System.out.println("Перше тестування зміни типу змінних:");
        System.out.println("змінна типу byte = " + upperTransform.byteNumber );
        System.out.println("змінна типу short = " + upperTransform.shortNumber);
        System.out.println("змінна типу int = " + upperTransform.intNumber);
        System.out.println("змінна типу long = " + upperTransform.longNumber);

        Transform upperTransform2 = new Transform();  //int->double

        upperTransform2.intNumber = 390;
        upperTransform2.doubleNumber = upperTransform2.intNumber;

        System.out.println("Друге тестування зміни типу змінних:");
        System.out.println("змінна типу int = " + upperTransform2.intNumber);
        System.out.println("змінна типу double = " + upperTransform2.doubleNumber);

        Transform upperTransform3 = new Transform();  //short->float->double

        upperTransform3.shortNumber = 32500;
        upperTransform3.floatNumber = upperTransform3.shortNumber;
        upperTransform3.doubleNumber = upperTransform3.floatNumber;

        System.out.println("Третє тестування зміни типу змінних:");
        System.out.println("змінна типу short = " + upperTransform3.shortNumber);
        System.out.println("змінна типу float = " + upperTransform3.doubleNumber);
        System.out.println("змінна типу double = " + upperTransform3.floatNumber);

        Transform upperTransform4 = new Transform(); //char->int

        upperTransform4.charSymbol = 180;
        upperTransform4.intNumber = upperTransform4.charSymbol;

        System.out.println("Четверте тестування зміни типу змінних:");
        System.out.println("змінна типу char = " + upperTransform4.charSymbol);
        System.out.println("змінна типу int = " + upperTransform4.intNumber);

        Transform downTransform = new Transform(); //int->float

        downTransform.intNumber = 2147483647;
        downTransform.floatNumber = (float) downTransform.intNumber;

        System.out.println("Перше тестування зміни типу змінних з ВТРАТОЮ точності:");
        System.out.println("змінна типу int = " + downTransform.intNumber);
        System.out.println("змінна типу float = " + downTransform.floatNumber);

    }
}
