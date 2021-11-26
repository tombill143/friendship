package Entity;

public class User {
  private String userEmail;
  private String userName;

  public User(String userEmail, String userName) {
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
    return "User{" +
            "userEmail='" + userEmail + '\'' +
            ", userName='" + userName + '\'' +
            '}';
  }
}
