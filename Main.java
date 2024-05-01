// Interface
interface Shape {
    double calculateArea();
}

// Abstract class
abstract class Polygon implements Shape {
    protected double width;
    protected double height;

    public Polygon(double width, double height) {
        this.width = width;
        this.height = height;
    }
}

// Encapsulation
class Rectangle extends Polygon {
    public Rectangle(double width, double height) {
        super(width, height);
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

class Triangle extends Polygon {
    public Triangle(double width, double height) {
        super(width, height);
    }

    @Override
    public double calculateArea() {
        return 0.5 * width * height;
    }
}

// Inheritance
class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }
}

// Polymorphism
class ShapeAreaCalculator {
    public static void printArea(Shape shape) {
        System.out.println("Area: " + shape.calculateArea());
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 4);
        Triangle triangle = new Triangle(6, 3);
        Square square = new Square(5);

        ShapeAreaCalculator.printArea(rectangle);
        ShapeAreaCalculator.printArea(triangle);
        ShapeAreaCalculator.printArea(square);
    }
}
