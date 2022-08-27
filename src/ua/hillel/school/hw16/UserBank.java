package ua.hillel.school.hw16;

public class UserBank {

    public static void main(String[] args) {

        try {
            MoneyTransactionUtil.sendTo("1234567890123456",
                    "1234567890123456", 50000);
        } catch (MoneyValueException e) {
            System.out.println("There is mistake in sum of transaction!!!");
            System.out.println("Sum of transaction can't be more than 100,000.00$");
            System.out.println("Please contact with Bank representatives.");
        } catch (AccountException e) {
            System.out.println("There is mistake in cards numbers during transaction!!!");
            System.out.println("It is possible that numbers of cards are equals!!!");
            System.out.println("Please contact with Bank representatives.");
        }
    }
}
