package crown.lib.behavioral.visitor;

/**
 * Description：
 */
class Monitor implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor visitor) {
        visitor.visit(this);
    }
}
