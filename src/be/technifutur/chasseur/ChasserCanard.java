package be.technifutur.chasseur;

import be.technifutur.superCanard.Canard;
import be.technifutur.superCanard.Colvert;

public class ChasserCanard {

    public static void main(String[] args) {
        Chasseur chasseur = new Chasseur();
        Canard colvert = new Colvert();


        Animal toto = new CanardAdapter(colvert);
        chasseur.chasser(toto);
    }
}
