public class TestMyRectangle {
    public static void main (String[] args) {
        // Creating instances from MyPoint for rectangle
        MyPoint topLeft = new MyPoint(2, 6);
        MyPoint bottomRight = new MyPoint(4, 8);

        // Creating MyRectangle instance from MyPoint object
        MyRectangle rectangleOne = new MyRectangle(topLeft, bottomRight);
        
        MyRectangle rectangleTwo = new MyRectangle(1, 5, 3, 7);

        // Testing class methods
        System.out.println("Rectangle One: " + rectangleOne);
        System.out.println("Height of Rectangle One: " + rectangleOne.getHeight());
        System.out.println("Width of Rectangle One: " + rectangleOne.getWidth());
        System.out.println("Area of Rectangle One: " + rectangleOne.getArea());
        System.out.println("");
        System.out.println("Rectangle Two: " + rectangleTwo);
        System.out.println("Height of Rectangle Two: " + rectangleTwo.getHeight());
        System.out.println("Width of Rectangle Two: " + rectangleTwo.getWidth());
        System.out.println("Area of Rectangle Two: " + rectangleTwo.getArea());

        // Updating instances with new values
        rectangleOne.setTopLeft(new MyPoint(3, 6));
        rectangleOne.setBottomRight(new MyPoint(8, 4));
        System.out.println("");
        System.out.println("Updated points for Rectangle One: " + rectangleOne);
        System.out.println("Updated Height of Rectangle One: " + rectangleOne.getHeight());
        System.out.println("Updated Width of Rectangle One: " + rectangleOne.getWidth());
        System.out.println("Updated Area of Rectangle One: " + rectangleOne.getArea());
    }
}
