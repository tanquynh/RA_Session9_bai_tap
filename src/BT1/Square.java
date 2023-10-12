package BT1;


public class Square implements Resizable {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void resize(double percent) {
        this.side *= (1 + percent / 100);
    }
    public double getArea() {
        return Math.pow(side, 2);
    }
}