package be.technifutur.superCanard;

public class CanardPlastique extends CanardStrategy {
    public CanardPlastique() {
        super(new NePasVoler(), new Coincoin());
    }

    @Override
    public void afficher() {
        System.out.println("je suis un canard en plastique");
    }
}
