package ru.mirea.kabanova;

public class MovableCircle implements Movable{
    private int radius;
    private MovablePoint center;

    public MovableCircle(int radius, MovablePoint center) {
        this.radius = radius;
        this.center = center;
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }
    public void moveUp() {
        System.out.println("Вверх окружность на: " + center.ySpeed);
    }

    public void moveDown() {
        System.out.println("Вниз окружность " + center.ySpeed);
    }


    public void moveLeft() {
        System.out.println("Влево окружность "+ center.xSpeed);
    }


    public void moveRight() {
        System.out.println("Вправо окружность "+ center.xSpeed);
    }
}
