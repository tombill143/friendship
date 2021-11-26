package Entities;

public class Request {
    private int requestId;
    private String senderUserEmail;
    private String receiveUserEmail;

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

  public Request(int requestId, String senderUserEmail, String receiveUserEmail) {
    this.requestId = requestId;
    this.senderUserEmail = senderUserEmail;
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
