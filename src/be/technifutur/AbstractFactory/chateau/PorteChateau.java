package be.technifutur.AbstractFactory.chateau;

import be.technifutur.AbstractFactory.Porte;

public class PorteChateau implements Porte {
    @Override
    public String description() {
        return "Poporte";
    }
}
