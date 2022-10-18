package crown.lib.behavioral.chain_of_responsibility;

/**
 * Description：
 */
class DebugLogger extends AbstractLogger {
    public DebugLogger(int level) {
        this.level = level;
    }

    @Override
    void write(String message) {
        System.out.println("Debug::Logger: " + message);
    }
}
