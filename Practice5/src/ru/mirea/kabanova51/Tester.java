package ru.mirea.kabanova51;
import java.lang.*;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        System.out.println("Введите температуру в Цельсиях: ");
        Scanner sc = new Scanner(System.in);
        Celsius C=new Celsius(sc.nextDouble());
        Fahrenheit F=new Fahrenheit(C);
        System.out.println("Температура в фаренгейтах: "+F.convert());
        Kelvin K=new Kelvin(C);
        System.out.println("Температура в Кельвинах: "+K.convert());
    }
}
