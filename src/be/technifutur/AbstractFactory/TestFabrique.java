package be.technifutur.AbstractFactory;

public class TestFabrique {

    public static void main(String[] args) {
        FabriqueAbstraite factory = FabriqueAbstraite.getFactory("Chateau");
        ElementLabyrinth[][] laby = getLabyrinth(factory);

        for(ElementLabyrinth e : laby[1]){
            System.out.println(e.description());
        }
    }


    public static ElementLabyrinth[][] getLabyrinth(FabriqueAbstraite factory){

        ElementLabyrinth[][] laby = new ElementLabyrinth[3][3];
        laby[0][0] = factory.createMur();
        laby[0][1] = factory.createMur();
        laby[0][2] = factory.createMur();
        laby[1][0] = factory.createPorte();
        laby[1][1] = factory.createPiece();
        laby[1][2] = factory.createPorte();
        laby[2][0] = factory.createMur();
        laby[2][1] = factory.createMur();
        laby[2][2] = factory.createMur();

        return laby;
    }

}
