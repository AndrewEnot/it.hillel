package ua.hillel.school.hw15;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        User[] newUsers;
        newUsers = new User[5];
        newUsers[0] = new User("Andrew1", "ASD123", "Petrov Oleksiy Ivanovytch",
                POSITIONS.BRANCH_MANAGER);
        newUsers[1] = new User("Humi44", "QWERTY", "Pupkin Pupok Pupkovich",
                POSITIONS.CHIEF_ACCOUNTANT);
        newUsers[2] = new User("SexyGirl65", "19657432", "Orlova Oksana Oleksandrivna",
                POSITIONS.CHIEF_FINANCIAL_OFFICER);
        newUsers[3] = new User("Plohish", "PPPPSSSS", "Tereshko Oleksii Fedorovich",
                POSITIONS.BRANCH_MANAGER);
        newUsers[4] = new User("Guest", "guest", "Zelenskij Volodymir Kirilovich",
                POSITIONS.ANONYMUS);

        Store newStore = new Store("PetrivkaCity", "www.petrivkacity.com", newUsers);

        tryLogin(newStore);
    }


    public static void tryLogin(Store store) {
        boolean isWorking = true;
        while (isWorking) {
            Scanner textIn = new Scanner(System.in);
            System.out.println("Login: ");
            String login = textIn.next();

            Scanner passIn = new Scanner(System.in);
            System.out.println("Password: ");
            String password = passIn.next();

            if (store.login(login, password)) {
                store.getCurrentUserRights(login);
                store.logout();
                isWorking = false;
            } else {
                System.out.println("Invalid login and/or Password!!!");
            }
        }
    }
}
/**

 */