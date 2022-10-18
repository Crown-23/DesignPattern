package crown.lib.structural.bridge;

/**
 * Description：
 */
class Red implements Color {
    @Override
    public void paint(String shape) {
        System.out.println("Red " + shape);
    }
}
