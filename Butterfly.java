package com.company;

public class Butterfly extends Insects {

    int lng; //размах крыла

    public Butterfly() {
        super();
    }

    public void setLng(int lng) {
        this.lng = lng;
    }

    public int getLng() {
        return lng;
    }

    @Override
    public String getInfo() {
        String s = String.format("Млекопитающее: %b | Цвет: %s | Опасно для человека: %b | Размах крыла: %d | Вид: %s\n",
                mammals, color, danger,lng, type);
        return s;
    }


}
