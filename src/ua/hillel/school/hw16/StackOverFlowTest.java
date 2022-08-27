package ua.hillel.school.hw16;

public class StackOverFlowTest {

    int count;

    public static void main(String[] args) {
        try {
            test(0);
        } catch (StackOverflowError e) {
            System.out.println("SMTH is WRONG!!!!");
        }
    }

    static void test(int count) {
        System.out.println(++count);
        test(count);
    }
}
