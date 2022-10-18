package crown.lib.behavioral.chain_of_responsibility;

/**
 * Description：
 */
class InfoLogger extends AbstractLogger {
    public InfoLogger(int level) {
        this.level = level;
    }

    @Override
    void write(String message) {
        System.out.println("Info::Logger: " + message);
    }
}
