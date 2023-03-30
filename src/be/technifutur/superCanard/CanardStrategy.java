package be.technifutur.superCanard;

public abstract class CanardStrategy implements Canard {
    private ComportementDeCancan comportementDeCancan;
    private ComportementDeVol comportementDeVol;

    public void setComportementDeCancan(ComportementDeCancan comportementDeCancan) {
        this.comportementDeCancan = comportementDeCancan;
    }

    public void setComportementDeVol(ComportementDeVol comportementDeVol) {
        this.comportementDeVol = comportementDeVol;
    }

    public CanardStrategy(ComportementDeVol vol, ComportementDeCancan cancan) {
        comportementDeVol = vol;
        comportementDeCancan = cancan;
    }

    @Override
    public void nager() {
        System.out.println("plouf plouf");
    }

    @Override
    public void effectuerCancan() {
        this.comportementDeCancan.cancaner();
    }

    @Override
    public void effectuerVol() {
        this.comportementDeVol.voler();
    }

    public ComportementDeCancan getComportementDeCancan() {
        return comportementDeCancan;
    }

    public ComportementDeVol getComportementDeVol() {
        return comportementDeVol;
    }
}
