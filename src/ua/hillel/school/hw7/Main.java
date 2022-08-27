package ua.hillel.school.hw7;

public class Main {

    public static void main(String[] args) {

        Client firstClient = new Client();
        firstClient.fullNameClient = "Кучерявий Петро Афанасійович";
        firstClient.ageClient = 21;
        firstClient.budgetClient = 25000.00;
        firstClient.creditClient = true;
        firstClient.wishCreditClient = true;

        if (firstClient.ageClient < 18) {
            int i = 18 - firstClient.ageClient;
            System.out.println("Просимо вибачення, Шановний " + firstClient.fullNameClient +
                    " але ви не досягли віку з якого можете придати автомобіль( Будемо чекати на Вас за " +
                    i + " років!!!!!!!!");
            return;
        }
        Car firstCar = new Car();
        firstCar.brandCar = "TOYOTA";
        firstCar.modelCar = "RAV 4";
        firstCar.priceCar = 24_000.00;
        firstCar.yearCar = 2020;

        if (firstClient.budgetClient >= firstCar.priceCar) {
            System.out.println("Вітаємо Вас, Шановний " + firstClient.fullNameClient
                    + " з придбанням автомобіля " + firstCar.brandCar + " " + firstCar.modelCar + " " +
                    firstCar.yearCar + " року виробництва !!!  Ціна покупки:" + firstCar.priceCar);
            return;
        }
        if (firstClient.creditClient && firstClient.wishCreditClient) {
            System.out.println("Шановний " + firstClient.fullNameClient +
                    " у Вас недостатньо коштів для придбання автомобіля " + firstCar.brandCar +
                    " " + firstCar.modelCar + " " + firstCar.yearCar + " року виробництва !!!  Ціна покупки:"
                    + firstCar.priceCar);
            System.out.println("Ми пропонуємо для вас кредит на 3 роки!!!");
            double creditPayment = (firstCar.priceCar - firstClient.budgetClient)/36;
            System.out.println("Місячний платіж складатиме: " + creditPayment);
            System.out.println("Вітаємо Вас з придбанням!!!");
            return;
        }
        double d = firstCar.priceCar - firstClient.budgetClient;
        System.out.println("Просимо вибачення, Шановний " + firstClient.fullNameClient +
                " Вам не вистачає " + d + " USD !!!" );
        System.out.println("На жаль, ми також не можемо надати Вам кредит!!!");
        System.out.println("Будемо раді Вас бачити пізніше, коли у Вас буде " + firstCar.priceCar + " USD !!!");
    }
}
