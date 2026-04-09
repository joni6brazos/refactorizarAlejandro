// After refactoring
abstract class ShapeRefactored {
    public abstract double calculateArea();
}
 
class Circle extends ShapeRefactored {
    double radius;
 
    public Circle(double radius) {
        this.radius = radius;
    }
 
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
 
class Rectangle extends ShapeRefactored {
    double length;
    double width;
 
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
 
    @Override
    public double calculateArea() {
        return length * width;
    }
}

class Cuadrado extends ShapeRefactored {
    double length;
     
    public Cuadrado(double length) {
        this.length = length;
    }
 
    @Override
    public double calculateArea() {
        return length * length;
    }
}

class Triangle extends ShapeRefactored {
    double h;
    double b;
 
    public Triangle(double h, double b) {
        this.h = h;
        this.b = b;
    }
 
    @Override
    public double calculateArea() {
        return (b * h) / 2;
    }
}