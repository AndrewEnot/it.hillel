package ua.hillel.school.hw15;

public class User {

   private String login;
   private String password;
   private String fullName;
   private POSITIONS role = POSITIONS.ANONYMUS;

   public User(String login, String password, String fullName, POSITIONS role) {
      this.login = login;
      this.password = password;
      this.fullName = fullName;
      this.role = role;
   }

   public String getLogin() {
      return login;
   }
   public String getPassword() {
      return password;
   }
   public String getFullName() {
      return fullName;
   }
   public POSITIONS getRole() {
      return role;
   }
}
