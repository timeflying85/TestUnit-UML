package be.technifutur.builder;

import java.util.Collections;
import java.util.List;

public class StringLabyrinthBuilder implements LabyrinthBuilder {

    private String result = "";
    private int currentLine;

    public String Build() {
//        StringBuilder sb = new StringBuilder();
//        for (List<String> line : labyrinth) {
//            sb.append(line);
//            sb.append("\n");
//        }
//        return sb.toString();
//        System.out.println("StringLabyrintheBuilder.build");
        return result;
    }

    @Override
    public LabyrinthBuilder start() {
        result = "";
        currentLine = 0;

        return this;

    }

    @Override
    public LabyrinthBuilder addMur(int line, int column) {
        //System.out.println("Mur line = " + line + ", column = " + column);
//        StringBuilder sb = new StringBuilder((CharSequence) labyrinth.get(line));
//        sb.setCharAt(column, 'X');
//        labyrinth.set(line, Collections.singletonList(sb.toString()));
        updateCurrentLine(line);
        result += "🧱";
        return this;

    }

    @Override
    public LabyrinthBuilder addPiece(int line, int column) {
//        System.out.println("Piece line = " + line + ", column = " + column);
//        StringBuilder sb = new StringBuilder((CharSequence) labyrinth.get(line));
//        sb.setCharAt(column, '.');
//        labyrinth.set(line, Collections.singletonList(sb.toString()));
        updateCurrentLine(line);
        result += "🟩";
        return this;
    }

    @Override
    public LabyrinthBuilder addPorte(int line, int column) {
        //System.out.println("Porte line = " + line + ", column = " + column);
//        StringBuilder sb = new StringBuilder((CharSequence) labyrinth.get(line));
//        sb.setCharAt(column, 'O');
//        labyrinth.set(line, Collections.singletonList(sb.toString()));
        updateCurrentLine(line);
        result += "🚪";
        return this;
    }

    private void updateCurrentLine(int line) {
        if (line > currentLine) {
            result += System.lineSeparator();
            currentLine++;
        }
    }
}
