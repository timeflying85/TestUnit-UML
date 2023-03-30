package be.technifutur.AbstractFactory.chateau;

import be.technifutur.AbstractFactory.FabriqueAbstraite;
import be.technifutur.AbstractFactory.Mur;
import be.technifutur.AbstractFactory.Piece;
import be.technifutur.AbstractFactory.Porte;

public class ChateauFactory extends FabriqueAbstraite {

    @Override
    public Porte createPorte() {
        return new PorteChateau();
    }

    @Override
    public Mur createMur() {
        return new MurChateau();
    }

    @Override
    public Piece createPiece() {
        return new PieceChateau();
    }
}
