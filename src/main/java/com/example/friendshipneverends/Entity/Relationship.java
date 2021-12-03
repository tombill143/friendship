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
  @Basic
  @Column(name = "source_user", length = 100, nullable = false)
  private String sourceUser;
  @Basic
  @Column(name = "destination_user", length = 100, nullable = false)
  private String destinationUser;


  public Relationship(int relationshipId, String sourceUser, String destinationUser) {
    this.relationshipId = relationshipId;
    this.sourceUser = sourceUser;
    this.destinationUser = destinationUser;
  }

  public int getRelationshipId() {
    return relationshipId;
  }

  public void setRelationshipId(int friendshipId) {
    this.relationshipId = friendshipId;
  }

  public String getSourceUser() {
    return sourceUser;
  }

  public void setSourceUser(String sourceUser) {
    this.sourceUser = sourceUser;
  }

  public String getDestinationUser() {
    return destinationUser;
  }

  public void setDestinationUser(String destinationUser) {
    this.destinationUser = destinationUser;
  }

  @Override
  public String toString() {
    return "Relationship{" +
            "relationshipId=" + relationshipId +
            ", sourceUser='" + sourceUser + '\'' +
            ", destinationUser='" + destinationUser + '\'' +
            '}';
  }
}