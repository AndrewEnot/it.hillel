package ua.hillel.school.hw15MVC;

import ua.hillel.school.hw15MVC.controller.Controller;
import ua.hillel.school.hw15MVC.model.POSITIONS;
import ua.hillel.school.hw15MVC.model.Store;
import ua.hillel.school.hw15MVC.model.User;

public class Main {

    public static void main(String[] args) {

        Controller newController = new Controller();
        Store newStore = generateBaseUsers();
        newController.tryLogin(newStore);
    }

    private static Store generateBaseUsers() {

        User[] newUsers = new User[5];{
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
        }
        return new Store("PetrivkaCity", "www.petrivkacity.com", newUsers);
    }
}