public class Kitty {
private String paw;
private String tail;

    public String getPaw() {
        return paw;
    }

    public String getTail() {
        return tail;
    }

    public Kitty(String paw, String tail) {
        this.paw = paw;
        this.tail = tail;
    }

    public String getInfo(){
        return "\nPaw: " + paw +
                "\nTail:" + tail;
    }
}
