package crown.lib.structural.decorator;

/**
 * Description：
 */
class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        paintRed();
    }

    private void paintRed() {
        System.out.println("Color: Red");
    }
}
