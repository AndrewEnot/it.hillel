package ua.hillel.school.hw15MVC.model;

public class Store {

    private String name;
    private String url;
    private User[] users;
    private User autorizedUser;

    public Store(String name, String url, User[] users) {
        this.name = name;
        this.url = url;
        this.users = users;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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

