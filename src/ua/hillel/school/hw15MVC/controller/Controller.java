package ua.hillel.school.hw15MVC.controller;

import ua.hillel.school.hw15MVC.model.Store;
import ua.hillel.school.hw15MVC.service.LogService;
import ua.hillel.school.hw15MVC.view.UserView;

import java.util.Scanner;

public class Controller {

    public void tryLogin(Store store) {
        System.out.println("Login & Password checking for entering " + store.getName() + " " + store.getUrl() + " :");
        boolean isWorking = true;
        while (isWorking) {
            Scanner textIn = new Scanner(System.in);
            System.out.println("Login: ");
            String login = textIn.next();

            Scanner passIn = new Scanner(System.in);
            System.out.println("Password: ");
            String password = passIn.next();

            if (LogService.login(login, password, store)) {
                UserView.getCurrentUserRights(login, store);
                LogService.logout(store);
                isWorking = false;
            } else {
                System.out.println("Invalid login and/or Password!!!");
            }
        }
    }
}
