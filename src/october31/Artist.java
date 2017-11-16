package october31;

public abstract class Artist {

    private String nickName;

    abstract void printNickName();

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
