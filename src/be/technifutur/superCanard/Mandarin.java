package be.technifutur.superCanard;

public class Mandarin extends CanardStrategy {
    public Mandarin() {
        super(new VolerAvecDesAiles(), new Coincoin());
    }

    @Override
    public void afficher() {
        System.out.println("Je suis un Mandarin");
    }
}
