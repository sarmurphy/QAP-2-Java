public class MyRectangle {
    private MyPoint topLeft, bottomRight;

    // Constructors
    public MyRectangle(int x1, int y1, int x2, int y2) {
        this.topLeft = new MyPoint(x1, y1);
        this.bottomRight = new MyPoint(x2, y2);
    }

    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    // Getter and Setter for topLeft
    public MyPoint getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(MyPoint topLeft) {
        this.topLeft = topLeft;
    }

    // Getter and Setter for bottomRight
    public MyPoint getBottomRight() {
        return bottomRight;
    }

    public void setBottomRight(MyPoint bottomRight) {
        this.bottomRight = bottomRight;
    }

    // Method for height of rectangle
    public int getHeight() {
        return Math.abs(bottomRight.getY() - topLeft.getY());
    }

    // Method for width of rectangle
    public int getWidth() {
        return Math.abs(bottomRight.getX() - topLeft.getX());
    }

    // Method for area of rectangle
    public int getArea() {
        return getHeight() * getWidth();
    }

    // Method to return a string of the rectangle
    public String toString() {
        return "MyRectangle[topLeft = " + topLeft + ", bottomRight = " + bottomRight +  "]";
    }
}
