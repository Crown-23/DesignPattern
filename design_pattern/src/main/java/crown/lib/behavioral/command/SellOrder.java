package crown.lib.behavioral.command;

/**
 * Description：
 */
class SellOrder implements Order {
    private Stock abcStock;

    public SellOrder(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.sell();
    }
}
