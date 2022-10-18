package crown.lib.behavioral.visitor;

/**
 * Description：
 */
class Keyboard implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor visitor) {
        visitor.visit(this);
    }
}
