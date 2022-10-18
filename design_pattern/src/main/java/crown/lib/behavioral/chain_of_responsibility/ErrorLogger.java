package crown.lib.behavioral.chain_of_responsibility;

/**
 * Description：
 */
class ErrorLogger extends AbstractLogger {
    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    void write(String message) {
        System.out.println("Error::Logger: " + message);
    }
}
