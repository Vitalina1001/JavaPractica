package ru.mirea.kvbo0121.kabanova;

import java.nio.channels.FileLock;

public class Main {
    public static void main(String[] args) {
       Double x=Double.valueOf("1.567"); //string to Double
       Double y=Double.valueOf(4.5); //double to Double
        System.out.println(x+" "+y);
        String s="23.32";
        double x1=Double.parseDouble(s); //string to double
        System.out.println(x1);
        double x2=-1.5423536832672836478236473447378;
        System.out.println("Преобразуем число "+x2+" ко всем примитивным типам");
        System.out.println("byte:"+(byte)x2);
        System.out.println("double:"+(double)x2);
        System.out.println("float:"+(float)x2);
        System.out.println("int:"+(int)x2);
        System.out.println("long:"+(long)x2);
        System.out.println("short:"+(short)x2);

       String str=Double.toString(x2);
        System.out.println("Double преобразованная в string   " + str);
    }
}
