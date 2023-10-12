package BT1;

public class Main {
    public static void main(String[] args) {
        Resizable[] shapes = new Resizable[3];
        shapes[0] = new Circle(15.0, "red");
        shapes[1] = new Rectangle(15.0, 10.0);
        shapes[2] = new Square(15.0);

        System.out.println(shapes[0].getArea());
        System.out.println(shapes[1].getArea());
        System.out.println(shapes[2].getArea());

        shapes[0].resize(Math.floor(Math.random()*100.0));
        shapes[1].resize(Math.floor(Math.random()*100.0));
        shapes[2].resize(Math.floor(Math.random()*100.0));

        System.out.println(shapes[0].getArea());
        System.out.println(shapes[1].getArea());
        System.out.println(shapes[2].getArea());
    }
}
