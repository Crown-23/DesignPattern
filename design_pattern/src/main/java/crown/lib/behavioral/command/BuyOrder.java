package crown.lib.behavioral.command;

/**
 * Description：
 */
class BuyOrder implements Order {
    private Stock abcStock;

    public BuyOrder(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.buy();
    }
}
