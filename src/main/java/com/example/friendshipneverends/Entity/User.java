package com.example.friendshipneverends.Entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name="user", schema="socialmedia")
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "user_email", nullable = false, length = 100)
  private String userEmail;
  @Basic
  @Column(name="userName", length = 250, nullable = false)
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
