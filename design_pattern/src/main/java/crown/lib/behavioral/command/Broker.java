package crown.lib.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Description：命令调用类
 */
class Broker {
    private List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public void placeOrders() {
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
