package crown.lib.creational.builder;

/**
 * Description：建造者模式
 * 将一个复杂的构建与其表示相分离，使得同样的构建过程可以创建不同的表示。
 * 注意事项：与工厂模式的区别是：建造者模式更加关注与零件装配的顺序。
 */
public class BuilderPatternDemo {
    public static void main(String[] args) {
        Builder builder = new MacBookBuilder();
        Director director = new Director(builder);
        director.construct("Intel", "Retina");

        Computer computer = builder.build();
        System.out.println(computer.toString());
    }
}
