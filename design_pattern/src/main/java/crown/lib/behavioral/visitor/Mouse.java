package crown.lib.behavioral.visitor;

/**
 * Description：
 */
class Mouse implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor visitor) {
        visitor.visit(this);
    }
}
