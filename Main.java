package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<Animal>();
        Insects cockchafer = new Insects();
        cockchafer.setColor("Черно-желтый");
        cockchafer.setDanger(false);
        cockchafer.setType("Майский");

        Insects mite = new Insects();
        mite.setColor("Черный");
        mite.setDanger(true);
        mite.setType("Клещ");

        Butterfly cabbage = new Butterfly();
        cabbage.setColor("Салатовый");
        cabbage.setDanger(false);
        cabbage.setType("Капустница");
        cabbage.setLng(12);

        Butterfly euproctis = new Butterfly();
        euproctis.setColor("Белый");
        euproctis.setDanger(true);
        euproctis.setType("Lymantriinae");
        euproctis.setLng(15);

        Bugs stercorarius = new Bugs();
        stercorarius.setColor("Черный");
        stercorarius.setDanger(false);
        stercorarius.setType("Geotrupidae");
        stercorarius.setLegs(6);

        Bugs mylabris = new Bugs();
        mylabris.setColor("Красный с черными пятнами");
        mylabris.setDanger(true);
        mylabris.setType("Meloidae");
        mylabris.setLegs(8);
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
