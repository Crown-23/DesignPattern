package crown.lib.behavioral.visitor;

/**
 * Description：
 */
interface ComputerPart {
    void accept(ComputerPartVisitor visitor);
}
