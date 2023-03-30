package be.technifutur.superCanard;

public class Leurre extends CanardStrategy {
    public Leurre() {
        super(new NePasVoler(), () -> {
            System.out.println("....!");
        })
        ;
    }
    @Override
    public void afficher() {
        System.out.println("je suis un Leurre");
    }
}
