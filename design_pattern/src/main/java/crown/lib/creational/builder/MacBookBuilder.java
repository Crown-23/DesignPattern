package crown.lib.creational.builder;

/**
 * Description：
 */
public class MacBookBuilder extends Builder {
    private final Computer mComputer = new MacBook();

    @Override
    void buildBoard(String board) {
        mComputer.setBoard(board);
    }

    @Override
    void buildDisplay(String display) {
        mComputer.setDisplay(display);
    }

    @Override
    void buildOs() {
        mComputer.setOs();
    }

    @Override
    Computer build() {
        return mComputer;
    }
}
