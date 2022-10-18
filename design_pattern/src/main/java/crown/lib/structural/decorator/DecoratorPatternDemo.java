package crown.lib.structural.decorator;

/**
 * Description：装饰器模式
 * 向一个现有的对象添加新的功能，同时又不改变其结构。
 * 装饰类和被装饰类可以独立发展，不会相互耦合，装饰模式是继承的一个替代模式，装饰模式可以动态扩展一个实现类的功能。
 * 使用场景： 1、扩展一个类的功能。 2、动态增加功能，动态撤销。
 */
class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        ShapeDecorator redCircle = new RedShapeDecorator(new Circle());
        ShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("Circle without color");
        circle.draw();

        System.out.println("\nCircle of red color");
        redCircle.draw();

        System.out.println("\nRectangle of red color");
        redRectangle.draw();
    }
}
