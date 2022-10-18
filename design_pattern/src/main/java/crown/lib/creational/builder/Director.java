package crown.lib.creational.builder;

/**
 * Description：监工类
 */
public class Director {
    private final Builder mBuilder;

    public Director(Builder builder) {
        mBuilder = builder;
    }

    public void construct(String board, String display) {
        mBuilder.buildBoard(board);
        mBuilder.buildDisplay(display);
        mBuilder.buildOs();
    }
}
