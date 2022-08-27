package ua.hillel.school.hw5;

public class ex3CreditCard {

    public static void main(String[] args) {

        ex3CCardAtt newCreditCard = new ex3CCardAtt();

        newCreditCard.type = "visa";
        newCreditCard.cardNumber ="4433 5566 7788 9900";
        newCreditCard.owner = "Homenko Petro";

        CardType(newCreditCard);

        ex3CCardAtt new2CreditCard = new ex3CCardAtt();

        new2CreditCard.type = "mastercard";
        new2CreditCard.cardNumber = "4422 3355 4466 1133";
        new2CreditCard.owner = "Teslenko Mykyta";

        CardType(new2CreditCard);

        ex3CCardAtt new3CreditCard = new ex3CCardAtt();

        new3CreditCard.type = "мир";
        new3CreditCard.cardNumber = "9933 4477 8800 2266";
        new3CreditCard.owner = "Gavrysh Roman";

        CardType(new3CreditCard);

        ex3CCardAtt new4CreditCard = new ex3CCardAtt();

        new4CreditCard.type = "amex";
        new4CreditCard.cardNumber = "1111 2222 3333 4444";
        new4CreditCard.owner = "John Smith";

        CardType(new4CreditCard);

    }

    private static void CardType(ex3CCardAtt newCreditCard) {

        System.out.println("Перевірка карти: " + newCreditCard.cardNumber + " .........");
        switch (newCreditCard.type) {
            case "visa":
            case "mastercard":
                System.out.println("Шановний " + newCreditCard.owner + " вітаємо, ви користуєтесь правильною картою!!!");
                break;
            case "мир":
                System.out.println(newCreditCard.owner + " пішов ти ХХХХ за російським кораблем!!!");
                break;
            default:
                System.out.println("Невідомий тип карти: " + newCreditCard.type);
        }
    }
}
