package crown.lib.creational.builder;

/**
 * Description：
 */
public abstract class Computer {
    protected String board;
    protected String display;
    protected String os;

    public void setBoard(String board) {
        this.board = board;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public abstract void setOs();

    @Override
    public String toString() {
        return "Computer{" +
                "board='" + board + '\'' +
                ", display='" + display + '\'' +
                ", os='" + os + '\'' +
                '}';
    }
}
