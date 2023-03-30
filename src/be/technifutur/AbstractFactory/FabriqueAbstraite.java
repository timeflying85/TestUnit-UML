package be.technifutur.AbstractFactory;

import be.technifutur.AbstractFactory.chateau.ChateauFactory;
import be.technifutur.AbstractFactory.jardin.JardinFactory;

public abstract class FabriqueAbstraite {

    public static FabriqueAbstraite getFactory(String type){
        return switch (type){
            case "Chateau" -> new ChateauFactory();
            case "Jardin" -> new JardinFactory();
            default -> null;
        };
    }

    public abstract Porte createPorte();

    public abstract Mur createMur();

    public abstract Piece createPiece();



}
