package crown.lib.behavioral.mediator;

/**
 * Description：抽象中介者
 */
abstract class Mediator {
    abstract void register(Colleague colleague);
    abstract void dispatch(Colleague colleague);
}
