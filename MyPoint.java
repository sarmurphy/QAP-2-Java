public class MyPoint {
    private int x, y;

    // Constructors
    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getters and Setters
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

    // Method to set x and y
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Returning a string of x and y points
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}