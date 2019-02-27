public class objOri {
    Circle c1 = new Circle(2.3);
    double result = c1(2.3);
    System.out.print(result);
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