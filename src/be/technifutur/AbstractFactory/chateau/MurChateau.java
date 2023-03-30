package be.technifutur.AbstractFactory.chateau;

import be.technifutur.AbstractFactory.Mur;

public class MurChateau implements Mur {
    @Override
    public String description() {
        return "Mur";
    }
}
