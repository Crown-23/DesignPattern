package crown.lib.behavioral.visitor;

/**
 * Description：访问者模式
 * 根据模式，元素对象已接受访问者对象，这样访问者对象就可以处理元素对象上的操作。
 * 如何解决：在被访问的类里面加一个对外提供接待访问者的接口。
 * 使用场景：
 * 1、对象结构中对象对应的类很少改变，但经常需要在此对象结构上定义新的操作。
 * 2、需要对一个对象结构中的对象进行很多不同的并且不相关的操作，而需要避免让这些操作"污染"这些对象的类，也不希望在增加新操作时修改这些类。
 */
class VisitorPatternDemo {
    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
