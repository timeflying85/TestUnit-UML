package be.technifutur.AbstractFactory.jardin;

import be.technifutur.AbstractFactory.Piece;

public class Jardin implements Piece {
    @Override
    public String description() {
        return "Pelouse";
    }
}
