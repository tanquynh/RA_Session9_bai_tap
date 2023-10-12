package BT4;

public abstract class Shape {
    String color;

    public Shape() {
    }

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    abstract double getArea();
    public void display(){
        System.out.println(this.color);
    };
}