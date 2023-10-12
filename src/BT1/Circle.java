package BT1;


public class Circle implements Resizable {
    private double radius;
    public String color;

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPerimeter() {
        return Math.PI * 2 * this.radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    public void inputData(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public void displayData() {
        System.out.println("Hình tròn có bán kính là: " + radius);
        System.out.println("Hình tròn có màu là: " + color);
    }

    @Override
    public void resize(double percent) {
        this.radius *= (1 + percent / 100);
    }
}
