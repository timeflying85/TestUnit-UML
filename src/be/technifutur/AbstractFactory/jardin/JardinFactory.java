package be.technifutur.AbstractFactory.jardin;

import be.technifutur.AbstractFactory.FabriqueAbstraite;
import be.technifutur.AbstractFactory.Mur;
import be.technifutur.AbstractFactory.Piece;
import be.technifutur.AbstractFactory.Porte;

public class JardinFactory extends FabriqueAbstraite {

    @Override
    public Porte createPorte() {
        return new Barriere();
    }

    @Override
    public Mur createMur() {
        return new Haie();
    }

    @Override
    public Piece createPiece() {
        return new Jardin();
    }
}
