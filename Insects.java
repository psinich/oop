package com.company;

public class Insects extends Animal {
    boolean danger; // опасно для человека

    Insects(boolean mammals, String color, String type, boolean danger) {
        super(mammals, color, type);
        this.danger = danger;
    }



    public void setDanger(boolean danger) {
        this.danger = danger;
    }

    public boolean getDanger() {
        return danger;
    }

    @Override
    public String getInfo() {
        String s = String.format("Млекопитающее: %b | Цвет: %s | Опасно для человека: %b | Вид: %s\n",
                mammals, color, danger, type);
        return s;
    }
}
