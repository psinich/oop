package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<Animal>();
        Insects cockchafer = new Insects(false, "Черно-желтый","Майский",false);
        Insects mite = new Insects(false,"Черный","Клещ",true);
        Butterfly cabbage = new Butterfly(false,"Салатовый","Капустница",false,12);
        Butterfly euproctis = new Butterfly(false,"Белый","Lymantriinae",true,15);
        Bugs stercorarius = new Bugs(false,"Черный","Geotrupidae",false,6);
        Bugs mylabris = new Bugs(false,"Красный с черными пятнами","Meloidae",true,8);
        animals.add(cockchafer);
        animals.add(mite);
        animals.add(cabbage);
        animals.add(euproctis);
        animals.add(stercorarius);
        animals.add(mylabris);
        for (int i = 0; i < animals.size(); i++) {
            System.out.print(animals.get(i).getInfo());
        }
    }

    }
