public class TestMyLine {
    public static void main(String[] args) {
        // Creating instances for MyPoint
        MyPoint p1 = new MyPoint(2, 4);
        MyPoint p2 = new MyPoint(6, 8);

        // Testing class methods
        System.out.println("p1: " + p1);
        System.out.println("p2: " + p2);
        p1.setX(1);
        p1.setY(3);

        p1.setXY(5, 7);
        System.out.println("Updated p1 coordinates: " + p1);

        // Creating instances for MyLine
        MyLine l1 = new MyLine(p1, p2);
        MyLine l2 = new MyLine(2, 4, 6, 8);

        // Testing class methods
        System.out.println("Line 1: " + l1);
        System.out.println("Line 2: " + l2);
        System.out.println("Length of Line 1: " + l1.getLength());
        System.out.println("Gradient of Line 1: " + l1.getGradient());
        System.out.println("Length of Line 2: " + l2.getLength());
        System.out.println("Gradient of Line 2: " + l2.getGradient());

        //Updating and testing MyLine instance
        l1.setBegin(new MyPoint(0, 0));
        l1.setEnd(new MyPoint(4, 6));

        System.out.println("Updated Line 1 position: " + l1);
        System.out.println("Updated length of Line 1: " + l1.getLength());
        System.out.println("Updated gradient of Line 1: " + l1.getGradient());
    }       
}
