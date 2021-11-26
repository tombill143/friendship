package com.example.friendshipneverends.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "friendship", schema = "socialmedia")
public class Friendship {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "friendship_id", nullable = false, length = 11)
  private int friendshipId;
  @Basic
  @Column(name = "friend_1_email", length = 100, nullable = false)
  private String friend1Email;
  @Basic
  @Column(name = "friend_2_email", length = 100, nullable = false)
  private String friend2Email;

  public Friendship(int friendshipId, String friend1Email, String friend2Email) {
    this.friendshipId = friendshipId;
    this.friend1Email = friend1Email;
    this.friend2Email = friend2Email;

  }

  public Friendship() {

  }

  public int getFriendshipId() {
    return friendshipId;
  }

  public void setFriendshipId(int friendshipId) {
    this.friendshipId = friendshipId;
  }

  public String getFriend1Email() {
    return friend1Email;
  }

  public void setFriend1Email(String friend1Email) {
    this.friend1Email = friend1Email;
  }

  public String getFriend2Email() {
    return friend2Email;
  }

  public void setFriend2Email(String friend2Email) {
    this.friend2Email = friend2Email;
  }

  @Override
  public String toString() {
    return "Friendship{" +
            "friendshipId=" + friendshipId +
            ", friend1Email='" + friend1Email + '\'' +
            ", friend2Email='" + friend2Email + '\'' +
            '}';
  }
}
