public class objOri {
    public static void main(String[] args) {
        Circle c1 = new Circle(2.3);
        System.out.println("The radius is: " + c1.getArea());
    }
}
class Circle {
    double radius = 1.0;

    Circle() {
    }

    Circle(double newRadius) {
        radius = newRadius;
    }

    double getArea() {
        return radius * radius * 3.14159;
    }
}