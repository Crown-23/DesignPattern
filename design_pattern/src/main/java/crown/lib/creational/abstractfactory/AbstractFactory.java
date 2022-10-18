package crown.lib.creational.abstractfactory;

/**
 * Description：
 * 两个产品族：Color、Shape
 */
interface AbstractFactory {
    Color getColor(String color);
    Shape getShape(String shape);
}
