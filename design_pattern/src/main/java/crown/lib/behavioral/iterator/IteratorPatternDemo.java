package crown.lib.behavioral.iterator;

/**
 * Description：迭代器模式
 * 提供一种方法顺序访问一个聚合对象中各个元素, 而又无须暴露该对象的内部表示。
 * 关键代码：定义接口：hasNext, next。
 */
class IteratorPatternDemo {
    public static void main(String[] args) {
        NameRepository repository = new NameRepository();

        for (Iterator iterator = repository.getIterator(); iterator.hasNext(); ) {
            System.out.println("Name : " + iterator.next());
        }
    }
}
