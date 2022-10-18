package crown.lib.structural.bridge;

/**
 * Description：
 */
class Green implements Color {
    @Override
    public void paint(String shape) {
        System.out.println("Green " + shape);
    }
}
