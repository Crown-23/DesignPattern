package crown.lib.behavioral.observer;

/**
 * Description：
 */
class OctalObserver extends Observer {
    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    void update() {
        System.out.println("Octal String: " + Integer.toOctalString(subject.getState()));
    }
}
