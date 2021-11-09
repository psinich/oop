package com.company;

public class Bugs extends Insects {

    int legs; //количество лап

    public Bugs(boolean mammals, String color, String type, boolean danger, int legs) {
        super(mammals, color, type, danger);
        this.legs = legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public int getLegs() {
        return legs;
    }

    @Override
    public String getInfo() {
        String s = String.format("Млекопитающее: %b | Цвет: %s | Опасно для человека: %b | Количество лап: %d | Вид: %s\n",
                mammals, color, danger, legs, type);
        return s;
    }
}
