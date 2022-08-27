package ua.hillel.school.hw15MVC.view;

import ua.hillel.school.hw15MVC.model.Store;
import ua.hillel.school.hw15MVC.model.User;

public class UserView {

    public static void getCurrentUserRights(String currentUserLogin, Store store) {

        for (User user : store.getUsers()) {
            if (currentUserLogin.equals(user.getLogin())) {
                System.out.println("User Name: " + user.getFullName());
                System.out.println("User Role: " + user.getRole());
                System.out.println("User Duties: " + user.getRole().getDuties());
            }
        }
    }
}
