package crown.lib.behavioral.mediator;

/**
 * Description：
 */
class ConcreteColleague2 extends Colleague {

    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    @Override
    void send() {
        System.out.println("ConcreteColleague2 send \"hi!\" to ConcreteColleague1");
        mediator.dispatch(this);
    }

    @Override
    void receive() {
        System.out.println("ConcreteColleague2 receive \"hello\" from ConcreteColleague1");
    }
}
