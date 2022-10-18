package crown.lib.behavioral.mediator;

/**
 * Description：抽象同事类
 */
abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
        mediator.register(this);
    }

    abstract void send();

    abstract void receive();
}
