package be.technifutur.builder;

public interface LabyrinthBuilder {

    LabyrinthBuilder start();

    LabyrinthBuilder addMur(int line, int column);

    LabyrinthBuilder addPiece(int line, int column);

    LabyrinthBuilder addPorte(int line, int column);

}
