package com.company;

public class Animal {

    boolean mammals;// млекопитающее
    String color;   // цвет
    String type;    // вид

    public Animal(boolean mammals, String color, String type) {
        this.mammals = mammals;
        this.color = color;
        this.type = type;
    }

    public Animal() {
    }

    public void setMammals(boolean mammals) {
        this.mammals = mammals;
    }

    public boolean getMammals() {
        return mammals;
    }


    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String getInfo() {
        String s = String.format("Млекопитающее: %b | Цвет: %s | Вид: %s\n", mammals, color, type);
        return s;
    }
}
