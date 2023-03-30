package be.technifutur.chasseur;

public class Chasseur {

    public void chasser(Animal a){
        System.out.println("PAN");
        a.sePresenter();
        a.crier();
        a.fuir();
    }
}
