package Entity;

public class Friendship {
  private int friendshipId;
  private String friend1Email;
  private String friend2Email;

  public Friendship(int friendshipId, String friend1Email, String friend2Email) {
    this.friendshipId = friendshipId;
    this.friend1Email = friend1Email;
    this.friend2Email = friend2Email;

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
