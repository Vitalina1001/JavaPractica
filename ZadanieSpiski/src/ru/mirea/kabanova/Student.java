package ru.mirea.kabanova;
import java.util.Scanner;
public class Student {
    protected String name;
    protected String surname;
    protected int age;
    protected Student next;
    public Student() {
        this.name = "";
        this.surname = "";
        this.age = 0;
    }
    public Student(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public void readStudent(){
        Scanner inName = new Scanner(System.in);
        this.name = inName.next();
        Scanner inSurname = new  Scanner(System.in);
        this.surname = inSurname.next();
        Scanner inAge = new  Scanner(System.in);
        this.age = inAge.nextInt();
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
