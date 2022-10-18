package crown.lib.structural.bridge;

/**
 * Description：
 */
class Blue implements Color {
    @Override
    public void paint(String shape) {
        System.out.println("Blue " + shape);
    }
}
