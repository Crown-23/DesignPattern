package crown.lib.behavioral.visitor;

/**
 * Description：
 */
class Computer implements ComputerPart {
    private final ComputerPart[] parts = new ComputerPart[]{new Mouse(), new Keyboard(), new Monitor()};

    @Override
    public void accept(ComputerPartVisitor visitor) {
        for (ComputerPart part : parts) {
            part.accept(visitor);
        }
        visitor.visit(this);
    }
}
