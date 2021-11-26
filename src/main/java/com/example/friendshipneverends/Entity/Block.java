package com.example.friendshipneverends.Entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "block", schema = "socialmedia")
public class Block {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "block_id", nullable = false, length = 11)
    private int blockId;
    @Basic
    @Column(name= "from_user_email", length = 100, nullable = false)
    private String fromUserEmail;
    @Basic
    @Column(name = "to_user_email", length = 100, nullable = false)
    private String toUserEmail;

    public Block() {
    }

    public Block(int blockId, String fromUserEmail, String toUserEmail) {
        this.blockId = blockId;
        this.fromUserEmail = fromUserEmail;
        this.toUserEmail = toUserEmail;
    }

    public int getBlockId() {
        return blockId;
    }

    public void setBlockId(int blockId) {
        this.blockId = blockId;
    }

    public String getFromUserEmail() {
        return fromUserEmail;
    }

    public void setFromUserEmail(String fromUserEmail) {
        this.fromUserEmail = fromUserEmail;
    }

    public String getToUserEmail() {
        return toUserEmail;
    }

    public void setToUserEmail(String toUserEmail) {
        this.toUserEmail = toUserEmail;
    }

    @Override
    public String toString() {
        return "Blocks{" +
                "blockId=" + blockId +
                ", fromUserEmail='" + fromUserEmail + '\'' +
                ", toUserEmail='" + toUserEmail + '\'' +
                '}';
    }
}