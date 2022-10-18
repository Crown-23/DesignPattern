package crown.lib.creational.singleton;

/**
 * Description：饿汉式
 * 基于 classloader 机制避免了多线程的同步问题
 */
public class SingleObject {
    private static final SingleObject sInstance = new SingleObject();

    //让构造函数为private，这样该类就不会被实例化
    private SingleObject() {}

    public static SingleObject getInstance() {
        return sInstance;
    }

    public void showMessage() {
        System.out.println("Hello World!");
    }
}
