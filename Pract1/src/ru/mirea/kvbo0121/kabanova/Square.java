package ru.mirea.kvbo0121.kabanova;

public class Square {
private double side;

    public double getSide() {
        return side;
    }
public double getSquare() {
return (this.side)*(this.side);
}
    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square {" +
                "side=" + side + " square=" +this.getSquare()+ "}";
    }

    public Square(double side) {
        this.side = side;
    }

}
