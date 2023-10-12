package BT4;

public class Rectangle extends Shape {
    double width, height;

    public Rectangle() {
    }

    public Rectangle(double width, double height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return this.width * this.height;
    }

    @Override
    public void display() {
        super.display();
    }
}