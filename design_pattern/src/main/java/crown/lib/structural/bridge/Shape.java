package crown.lib.structural.bridge;

/**
 * Description：
 */
abstract class Shape {
    Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    abstract void draw();
}
