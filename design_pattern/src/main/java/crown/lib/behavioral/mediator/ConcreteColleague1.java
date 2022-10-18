package crown.lib.behavioral.mediator;

/**
 * Description：
 */
class ConcreteColleague1 extends Colleague {

    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    @Override
    void send() {
        System.out.println("ConcreteColleague1 send \"hello\" to ConcreteColleague2");
        mediator.dispatch(this);
    }

    @Override
    void receive() {
        System.out.println("ConcreteColleague1 receive \"hi!\" from ConcreteColleague2");
    }
}
