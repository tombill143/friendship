package Entity;

public class Block {

    private int blockId;
    private String fromUserEmail;
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