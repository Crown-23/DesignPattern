package crown.lib.structural.flyweight;

import java.util.HashMap;

/**
 * Description：
 */
class ShapeFactory {
    private static final HashMap<String, Circle> shapeMap = new HashMap<>();

    public static Circle getCircle(String color) {
        Circle circle = shapeMap.get(color);

        if (circle == null) {
            circle = new Circle(color);
            shapeMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}
