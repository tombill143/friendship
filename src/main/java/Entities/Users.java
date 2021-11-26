package Entities;

public class Users {
  private String userEmail;
  private String userName;

  public Users(String userEmail, String userName) {
    this.userEmail = userEmail;
    this.userName = userName;
  }

  public String getUserEmail() {
    return userEmail;
  }

  public void setUserEmail(String userEmail) {
    this.userEmail = userEmail;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  @Override
  public String toString() {
    return "Users{" +
            "userEmail='" + userEmail + '\'' +
            ", userName='" + userName + '\'' +
            '}';
  }
}
