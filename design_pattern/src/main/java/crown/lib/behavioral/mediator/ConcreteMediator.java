package crown.lib.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * Description：
 */
class ConcreteMediator extends Mediator {
    private final List<Colleague> colleagues = new ArrayList<>();

    @Override
    void register(Colleague colleague) {
        if (!colleagues.contains(colleague)) {
            colleagues.add(colleague);
        }
    }

    @Override
    void dispatch(Colleague colleague) {
        for (Colleague item : colleagues) {
            if (!item.equals(colleague)) {
                item.receive();
            }
        }
    }
}
