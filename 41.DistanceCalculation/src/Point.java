public class Point {
    private int x;
    private int y;

    public Point() {}

    public Point(int x, int y) {
        this.x = x;
        this.y = y;

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(int x, int y) {
        int xDiff = x - this.x;
        int yDiff = y - this.y;
        return Math.sqrt(Math.pow(xDiff , 2) + Math.pow(yDiff, 2 ));
    }

    public double distance(Point p) {
        return distance(p.x, p.y);

    }
    public double distance() {
        return distance(0, 0);
    }
}
