package crown.lib.behavioral.command;

/**
 * Description：命令模式
 * 请求以命令的形式包裹在对象中，并传给调用对象。调用对象寻找可以处理该命令的合适的对象，并把该命令传给相应的对象，该对象执行命令。
 * 主要解决：在软件系统中，行为请求者与行为实现者通常是一种紧耦合的关系，但某些场合，比如需要对行为进行记录、撤销或重做、事务等处理时，这种无法抵御变化的紧耦合的设计就不太合适。
 * 缺点：使用命令模式可能会导致某些系统有过多的具体命令类。
 */
class CommandPatternDemo {
    public static void main(String[] args) {
        Stock abcStock = new Stock();

        BuyOrder buyOrder = new BuyOrder(abcStock);
        SellOrder sellOrder = new SellOrder(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyOrder);
        broker.takeOrder(sellOrder);

        broker.placeOrders();
    }
}
