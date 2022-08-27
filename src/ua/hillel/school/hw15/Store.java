package ua.hillel.school.hw15;

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

    public String getUrl() {
        return url;
    }

    public User[] getUsers() {
        return users;
    }

    public User getAutorizedUser() {
        return autorizedUser;
    }

    public void getCurrentUserRights(String currentUserLogin) {
        for (User user : users) {
            if (currentUserLogin.equals(user.getLogin())) {
                System.out.println("User Name: " + user.getFullName());
                System.out.println("User Role: " + user.getRole());
                System.out.println("User Duties: " + user.getRole().getDuties());
            }
        }
    }
    public boolean login(String login, String password) {
        boolean check = false;
        for (User user : users) {
            if (login.equals(user.getLogin()) && password.equals(user.getPassword())) {
                autorizedUser = user;
                check = true;
                break;
            }
        }
        return check;
    }
    public void logout (){
        autorizedUser = new User(null,null,null,null);
    }


}
