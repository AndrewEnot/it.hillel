package ua.hillel.school.hw15MVC.service;

import ua.hillel.school.hw15MVC.dto.StoreDto;
import ua.hillel.school.hw15MVC.model.Store;
import ua.hillel.school.hw15MVC.model.User;

public class LogService {

    public static boolean login(String login, String password, Store store) {
        boolean check = false;
        StoreDto storeDto = new StoreDto(store.getUsers(), store.getAutorizedUser());
        for (int i = 0; i < storeDto.getUsers().length; i++) {
            if (login.equals(storeDto.getUsers()[i].getLogin()) &&
                    password.equals((storeDto.getUsers()[i].getPassword()))){
                storeDto.setAutorizedUser(storeDto.getUsers()[i]);
                check = true;
                break;
            }
        }
        return check;
    }
    public static void logout (Store store) {
        store.setAutorizedUser(new User(null, null,null,null));
    }

}
