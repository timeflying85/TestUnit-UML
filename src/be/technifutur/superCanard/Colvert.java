package be.technifutur.superCanard;

public class Colvert extends CanardStrategy {
    public Colvert() {
        super(new VolerAvecDesAiles(), new Cancan());
    }

    @Override
    public void afficher() {
        System.out.println("Je suis un Colvert");
    }
}
