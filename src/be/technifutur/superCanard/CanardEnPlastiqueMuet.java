package be.technifutur.superCanard;

public class CanardEnPlastiqueMuet extends CanardStrategy {
    public CanardEnPlastiqueMuet() {
        super(new NePasVoler(), new Muet());
    }

    @Override
    public void afficher() {
        System.out.println("canard en plastique muet");
    }
}
