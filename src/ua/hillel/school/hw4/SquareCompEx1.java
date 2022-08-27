package ua.hillel.school.hw4;

public class SquareCompEx1 {

    public static void main(String[] args) {
        SquareSide firstSquare = new SquareSide();
        firstSquare.squareSide = 2;

        firstSquare.squarePerim = 4 * firstSquare.squareSide;
        firstSquare.squareArea = firstSquare.squareSide * firstSquare.squareSide;
        firstSquare.sqComp = (firstSquare.squarePerim ==  firstSquare.squareArea);

        System.out.println("Якщо сторона квадрата = " + firstSquare.squareSide);
        System.out.println("Периметр дорівнює площі " + firstSquare.sqComp);

        SquareSide secondSquare = new SquareSide();
        secondSquare.squareSide = 4;
        secondSquare.squarePerim = 4 * secondSquare.squareSide;
        secondSquare.squareArea = secondSquare.squareSide * secondSquare.squareSide;
        secondSquare.sqComp = (secondSquare.squarePerim ==  secondSquare.squareArea);

        System.out.println("Якщо сторона квадрата = " + secondSquare.squareSide);
        System.out.println("Периметр дорівнює площі " + secondSquare.sqComp);
    }
}