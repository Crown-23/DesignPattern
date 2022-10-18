package crown.lib.behavioral.state;

/**
 * Description：
 */
class Context {
    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
