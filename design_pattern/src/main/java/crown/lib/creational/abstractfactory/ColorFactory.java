package crown.lib.creational.abstractfactory;

/**
 * Description：
 */
public class ColorFactory implements AbstractFactory {
    @Override
    public Color getColor(String color) {
        if (color.equalsIgnoreCase("RED")) {
            return new Red();
        } else if (color.equalsIgnoreCase("GREEN")) {
            return new Green();
        } else if (color.equalsIgnoreCase("BLUE")) {
            return new Blue();
        }
        return null;
    }

    public Shape getShape(String shapeType) {
        return null;
    }
}
