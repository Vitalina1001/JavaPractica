package ru.mirea.kvbo0121.kabanova;

public class Author
{
    private String name="Vitalina";
    private String email="vitalina-kva@yandex.ru";
    private char gender='f';

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                '}';
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
