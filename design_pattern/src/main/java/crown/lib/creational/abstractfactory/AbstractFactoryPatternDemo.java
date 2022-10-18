package crown.lib.creational.abstractfactory;

/**
 * Description：抽象工厂模式
 * 两个产品族：Color、Shape
 * Color的产品等级：Red、Green、Blue
 * Shape的产品等级：Circle、Rectangle、Square
 *
 * 抽象工厂模式（Abstract Factory Pattern）是围绕一个超级工厂创建其他工厂。该超级工厂又称为其他工厂的工厂。
 */
public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();

        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        rectangle.draw();

        Shape square = shapeFactory.getShape("SQUARE");
        square.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        Color blue = colorFactory.getColor("BLUE");
        blue.fill();

        Color green = colorFactory.getColor("GREEN");
        green.fill();

        Color red = colorFactory.getColor("RED");
        red.fill();
    }
}
