package be.technifutur.AbstractFactory.jardin;

import be.technifutur.AbstractFactory.FabriqueAbstraite;
import be.technifutur.AbstractFactory.Mur;
import be.technifutur.AbstractFactory.Piece;
import be.technifutur.AbstractFactory.Porte;

public class JardinFactory extends FabriqueAbstraite {

    private Haie haie;

    private Barriere barriere;

    @Override
    public Porte createPorte() {
        if (this.barriere == null) {
            this.barriere = new Barriere();
        }
        return this.barriere;
    }


    @Override
    public Mur createMur() {
        if(this.haie == null){
            this.haie = new Haie();
        }
        return this.haie;
    }

    @Override
    public Piece createPiece() {
        return new Jardin();
    }
}
