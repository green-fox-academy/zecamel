public class Box {
    double height;
    double length;
    double depth;

    Box(double height, double length, double depth) {
        this.height = height;
        this.length = length;
        this.depth = depth;

    }

    public double getSurface() {
        return 2 * this.height + 2 * this.length + 2 * this.depth;

    }

    public double volume() {
        return this.height * this.length * this.depth;
    }
}
