package ru.mirea.kabanova;

public class MovablePoint implements Movable{
    protected int x;
    protected int y;
    protected int xSpeed;

    public int getxSpeed() {
        return xSpeed;
    }

    public int getySpeed() {
        return ySpeed;
    }

    protected int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }

    public void moveUp() {
        System.out.println("На " + ySpeed + " Вверх");
    }

    public void moveDown() {
        System.out.println("На " + ySpeed + " Вниз");
    }

    public void moveLeft() {
        System.out.println("На " + xSpeed + " Влево");
    }

    public void moveRight() {
        System.out.println("На " + xSpeed + " Вправо");
    }
}
