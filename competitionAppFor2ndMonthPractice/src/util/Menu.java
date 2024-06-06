package util;

public enum Menu {

    REGISTER(1, "Yarışmacıları register et"),
    START(2, "Yarışmaya başla"),
    LOGOUT(3, "Logout"),
    EXIT(4, "Exit");

    private String label;
    private int num;

    Menu(int num, String label) {
        this.label = label;
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public String getLabel() {
        return label;
    }
}
