package be.technifutur.superCanard;

public class Alternate implements ComportementDeCancan{
    private boolean on;
    private ComportementDeCancan cri1;
    private ComportementDeCancan cri2;

    public Alternate(ComportementDeCancan cri1, ComportementDeCancan cri2) {
        this.cri1 = cri1;
        this.cri2 = cri2;
    }

    @Override
    public void cancaner() {
        if(on){
            cri1.cancaner();
        }else{
            cri2.cancaner();
        }
        on = ! on;
    }
}
