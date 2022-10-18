package crown.lib.creational.prototype;

/**
 * Description：原型模式
 * 在实际项目中，原型模式很少单独出现，一般是和工厂模式一起出现，通过 clone 的方法创建一个对象，然后由工厂方法提供给调用者。
 * 与通过对一个类进行实例化来构造新对象不同的是，原型模式是通过拷贝一个现有对象生成新对象的。浅拷贝实现 Cloneable，重写 clone()；深拷贝是通过实现 Serializable 读取二进制流。
 */
public class PrototypePatternDemo {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape1 = ShapeCache.getShape("1");
        System.out.println("Shape: " + clonedShape1.getType());

        Shape clonedShape2 = ShapeCache.getShape("2");
        System.out.println("Shape: " + clonedShape2.getType());

        Shape clonedShape3 = ShapeCache.getShape("3");
        System.out.println("Shape: " + clonedShape3.getType());
    }
}
