package be.technifutur.AbstractFactory.jardin;

import be.technifutur.AbstractFactory.Porte;

public class Barriere implements Porte {
    @Override
    public String description() {
        return "Barriere";
    }
}
