package crown.lib.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Description：备忘录管理类
 */
class CareTaker {
    private final List<Memento> mementoList = new ArrayList<>();

    public void add(Memento state) {
        mementoList.add(state);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }
}
