package be.technifutur.superCanard;

public class Begayer implements ComportementDeCancan{
    private ComportementDeCancan cri;

    public Begayer(ComportementDeCancan cri) {
        this.cri = cri;
    }

    @Override
    public void cancaner() {
        cri.cancaner();
        cri.cancaner();
    }
}
