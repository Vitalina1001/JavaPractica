package ru.mirea.kabanova51;

public class Kelvin implements Convertable{
    private Celsius t;

    public Kelvin(Celsius t) {
        this.t = t;
    }

    public double convert() {
        return t.getT()+273;
    }
}
