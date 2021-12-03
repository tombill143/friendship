package com.example.friendshipneverends.Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Table(name = "relationship", schema = "customers6")
public class Relationship {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "relationship_id", length = 11, nullable = false)
  private int relationshipId;
  @OneToMany
  @JoinColumn(name= "email", nullable = false)
  private User sourceUser;
  @OneToMany
  @JoinColumn(name = "email", nullable = false)
  private User destinationUser;
  @Basic
  @Column(name="connection", length =200, nullable = false)
  private String connection;

  public Relationship(int relationshipId, User sourceUser, User destinationUser, String connection) {
    this.relationshipId = relationshipId;
    this.sourceUser = sourceUser;
    this.destinationUser = destinationUser;
    this.connection = connection;
  }

  public int getRelationshipId() {
    return relationshipId;
  }

  public void setRelationshipId(int relationshipId) {
    this.relationshipId = relationshipId;
  }

  public User getSourceUser() {
    return sourceUser;
  }

  public void setSourceUser(User sourceUser) {
    this.sourceUser = sourceUser;
  }

  public User getDestinationUser() {
    return destinationUser;
  }

  public void setDestinationUser(User destinationUser) {
    this.destinationUser = destinationUser;
  }

  public String getConnection() {
    return connection;
  }

  public void setConnection(String connection) {
    this.connection = connection;
  }

  @Override
  public String toString() {
    return "Relationship{" +
            "relationshipId=" + relationshipId +
            ", sourceUser=" + sourceUser +
            ", destinationUser=" + destinationUser +
            ", connection='" + connection + '\'' +
            '}';
  }
}