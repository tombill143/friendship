package com.example.friendshipneverends.Entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name= "user", schema= "customers6")
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "user_email", length = 100, nullable = false)
  private String userEmail;
  @Basic
  @Column(name="host", length = 250, nullable = false)
  private String host;


  public User(String userEmail, String host) {
    this.userEmail = userEmail;
    this.host = host;
  }

  public String getUserEmail() {
    return userEmail;
  }

  public void setUserEmail(String userEmail) {
    this.userEmail = userEmail;
  }

  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  @Override
  public String toString() {
    return "User{" +
            "userEmail='" + userEmail + '\'' +
            ", host='" + host + '\'' +
            '}';
  }
}
