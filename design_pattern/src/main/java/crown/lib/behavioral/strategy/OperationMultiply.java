package crown.lib.behavioral.strategy;

/**
 * Description：
 */
class OperationMultiply implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
