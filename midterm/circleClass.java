class circleClass {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(3.0);
        Circle c3 = new Circle(4.0, "Blue");

        System.out.println("The radius of c1: " + c1.getRadius() + " Color of c1: " + c1.getColor() + " Area of c1: " + c1.getArea()); 
        System.out.println("The radius of c2: " + c2.getRadius() + " Color of c2: " + c2.getColor() + " Area of c2: " + c2.getArea());
        System.out.println("The radius of c3: " + c3.getRadius() + " Color of c3: " + c3.getColor() + " Area of c3: " + c3.getArea());  
    }
}

class Circle {
    double radius = 1.0;
    String color = "Red";

    Circle() {
    }

    Circle(double newRadius) {
        radius = newRadius;
        //color = "Red";
    }
    Circle(String newColor, double newRadius) {
        color = newColor;
        radius = newRadius;
    }
    double getRadius() {
        return radius;
    }
    double getArea() {
        return radius * radius * 3.14159;
    }
    String getColor() {
        return color;
    }
}
