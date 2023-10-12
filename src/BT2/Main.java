package BT2;

public class Main {
    public static void main(String[] args) {
        Colorable[] shapes = new Colorable[2];
        shapes[0] = new Square(15.0);
        shapes[1] = new Square(20.0);

        System.out.println(shapes[0].getArea());
        shapes[0].howToColor();

        System.out.println(shapes[1].getArea());
        shapes[1].howToColor();

    }
}
