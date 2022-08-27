package ua.hillel.school.hw15MVC.dto;

import ua.hillel.school.hw15MVC.model.User;

public class StoreDto {


    private User[] users;
    private User autorizedUser;

    public StoreDto(User[] users, User autorizedUser) {
        this.users = users;
        this.autorizedUser = autorizedUser;
    }

    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }

    public User getAutorizedUser() {
        return autorizedUser;
    }

    public void setAutorizedUser(User autorizedUser) {
        this.autorizedUser = autorizedUser;
    }
}