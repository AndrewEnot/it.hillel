package ua.hillel.school.hw16;

public class MoneyTransactionUtil {

    String cardNumberSender;
    String cardNumberReceiver;
    double sumTransaction;

    private MoneyTransactionUtil(String cardNumberSender, String cardNumberReceiver, double sumTransaction) {
        this.cardNumberSender = cardNumberSender;
        this.cardNumberReceiver = cardNumberReceiver;
        this.sumTransaction = sumTransaction;
    }

    static void sendTo(String cardNumberSender, String cardNumberReceiver, double sumTransaction)
            throws AccountException, MoneyValueException {
        if (cardNumberSender.equals(cardNumberReceiver)) {
            throw new AccountException();
        }
        if (sumTransaction <= 0 || sumTransaction > 100_000) {
            throw new MoneyValueException();
        }
        System.out.println("Transaction of " + sumTransaction + " $");
        System.out.println("From card: " + cardNumberSender);
        System.out.println("To card: " + cardNumberReceiver);
        System.out.println("SUCCESSFUL");
    }
}
