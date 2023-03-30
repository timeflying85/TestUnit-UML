package be.technifutur.chasseur;

import be.technifutur.superCanard.Canard;

public class CanardAdapter implements Animal {
    private final Canard canard;

    public CanardAdapter(Canard canard) {
        this.canard = canard;
    }

    @Override
    public void crier() {
        canard.effectuerCancan();
    }

    @Override
    public void fuir() {
        canard.effectuerVol();
    }

    @Override
    public void sePresenter() {
        canard.afficher();
    }
}
