public class TriangleClass {
    public static void main(String[] args) {
        Triangle c1 = new Triangle();
        Triangle c2 = new Triangle(3.0, 5.0, 4.0);
        Triangle c3 = new Triangle(4.0, 4.0, 4.0);

        System.out.println("The Area of c1: " + c1.getArea() + " Side1: " + c1.getSide1());
        System.out.println("The Area of c2: " + c2.getArea() + " Side2: " + c2.getSide2()); 
        System.out.println("The Area of c3: " + c3.getArea() + " Side3: " + c3.getSide3());}
}

class Triangle {
    double side1 = 2.0;
    double side2 = 2.0;
    double side3 = 2.0;

    Triangle() {
    }
    public Triangle(double newSide1, double newSide2, double newSide3) {
        side1 = newSide1;
        side2 = newSide2;
        side3 = newSide3;
    }
    double getSide1() {
        return side1;
    }
    double getSide2() {
        return side2;
    }
    double getSide3() {
        return side3;
    }
    double getArea() {
        double s = (side1 + side2 + side3)/2;
        return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    }
}