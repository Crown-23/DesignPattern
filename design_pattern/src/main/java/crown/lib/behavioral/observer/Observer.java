package crown.lib.behavioral.observer;

/**
 * Description：观察者
 */
abstract class Observer {
    protected Subject subject;
    abstract void update();
}
