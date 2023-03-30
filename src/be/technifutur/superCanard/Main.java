package be.technifutur.superCanard;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<CanardStrategy> mare = Arrays.asList(
                new Colvert(),
                new Mandarin(),
                new CanardPlastique(),
                new Leurre(),
                new CanardEnPlastiqueMuet()
        );

        for (CanardStrategy c : mare){
            System.out.println("~~~~~~~~~~~~~~~");
            c.afficher();
            c.nager();
            c.setComportementDeCancan(new Begayer(c.getComportementDeCancan()));
            c.effectuerCancan();
            c.effectuerVol();
        }
    }


}
