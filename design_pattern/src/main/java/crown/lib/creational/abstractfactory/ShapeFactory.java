package crown.lib.creational.abstractfactory;

/**
 * Description：
 */
public class ShapeFactory implements AbstractFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    public Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
