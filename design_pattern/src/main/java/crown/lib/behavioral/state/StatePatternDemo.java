package crown.lib.behavioral.state;

/**
 * Description：状态模式
 * 在状态模式中，我们创建表示各种状态的对象和一个行为随着状态对象改变而改变的 context 对象。
 * 状态模式和命令模式一样，也可以用于消除 if...else 等条件选择语句。
 * 缺点：状态模式对"开闭原则"的支持并不太好，对于可以切换状态的状态模式，增加新的状态类需要修改那些负责状态转换的源代码，否则无法切换到新增状态，而且修改某个状态类的行为也需修改对应类的源代码。
 * 使用场景： 1、行为随状态改变而改变的场景。 2、条件、分支语句的代替者。
 * 注意事项：在行为受状态约束的时候使用状态模式，而且状态不超过 5 个。
 */
class StatePatternDemo {
    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);
        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);
        System.out.println(context.getState().toString());
    }
}
