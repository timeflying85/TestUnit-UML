package be.technifutur.builder;

import be.technifutur.AbstractFactory.ElementLabyrinth;
import be.technifutur.AbstractFactory.FabriqueAbstraite;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ArrayLabyrinthBuilder implements LabyrinthBuilder {

    private final FabriqueAbstraite factory;
    private ArrayList<ArrayList<ElementLabyrinth>> stock;

    private int currentLine;

    private void updateCurrentLine(int line) {
        if (line > currentLine) {
            stock.add(new ArrayList<ElementLabyrinth>());
            currentLine++;
        }
    }

    public ArrayLabyrinthBuilder(FabriqueAbstraite factory) {
        this.factory = factory;
    }

    public ElementLabyrinth[][] build(){

        ElementLabyrinth[][] result = new ElementLabyrinth[stock.size()][];

        ArrayList<ElementLabyrinth>[] tab = stock.toArray(new ArrayList[0]);

        for (int i = 0; i < tab.length; i++){
            result[i]= tab[i].toArray(new ElementLabyrinth[0]);
        }
        return result;
    }


    @Override
    public LabyrinthBuilder start() {
        stock = new ArrayList<ArrayList<ElementLabyrinth>>();
        currentLine = -1;
        return this;
    }

    @Override
    public LabyrinthBuilder addMur(int line, int column) {
        updateCurrentLine(line);
        stock.get(currentLine).add(factory.createPiece());
        return this;
    }

    @Override
    public LabyrinthBuilder addPiece(int line, int column) {
        updateCurrentLine(line);
        stock.get(currentLine).add(factory.createPiece());
        return this;
    }

    @Override
    public LabyrinthBuilder addPorte(int line, int column) {
        updateCurrentLine(line);
        stock.get(currentLine).add(factory.createPorte());
        return this;
    }


}
