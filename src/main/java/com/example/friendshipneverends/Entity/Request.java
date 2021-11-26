package com.example.friendshipneverends.Entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "request", schema = "socialmedia")
public class Request {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "request_id", nullable = false, length = 11)
    private int requestId;
    @Basic
    @Column(name = "friend_1_email", length = 100, nullable = false)
    private String senderUserEmail;
    @Basic
    @Column(name = "friend_1_email", length = 100, nullable = false)
    private String receiveUserEmail;

    public Request() {

    }

    public Request(int requestId, String senderUserEmail, String receiveUserEmail) {
        this.requestId = requestId;
        this.senderUserEmail = senderUserEmail;
        this.receiveUserEmail = receiveUserEmail;
    }

    public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    public String getSenderUserEmail() {
        return senderUserEmail;
    }

    public void setSenderUserEmail(String senderUserEmail) {
        this.senderUserEmail = senderUserEmail;
    }

    public String getReceiveUserEmail() {
        return receiveUserEmail;
    }

    public void setReceiveUserEmail(String receiveUserEmail) {
        this.receiveUserEmail = receiveUserEmail;
    }

    @Override
    public String toString() {
        return "Request{" +
                "requestId=" + requestId +
                ", senderUserEmail='" + senderUserEmail + '\'' +
                ", receiveUserEmail='" + receiveUserEmail + '\'' +
                '}';
    }
}
