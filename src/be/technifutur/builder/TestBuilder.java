package be.technifutur.builder;

import be.technifutur.AbstractFactory.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class TestBuilder {

    public static void main(String[] args) {

        FabriqueAbstraite factory = FabriqueAbstraite.getFactory("Chateau");
        ElementLabyrinth[][] labyrinth = TestFabrique.getLabyrinth(factory);
        /*
        StringLabyrinthBuilder builder = new StringLabyrinthBuilder();
        makeFromArrays(builder, labyrinth);
        System.out.println("----------");
        System.out.println(builder.Build());
        */
        ArrayLabyrinthBuilder arrayBuilder = new ArrayLabyrinthBuilder(factory);
        makeFromFile(arrayBuilder, "labyrinth.txt");
        ElementLabyrinth[][] labyrinthTab = arrayBuilder.build();

        Arrays.stream(labyrinthTab)
                .flatMap(Arrays::stream)
                .map(ElementLabyrinth::description)
                .forEach(System.out::println);

        StringLabyrinthBuilder builder = new StringLabyrinthBuilder();
        makeFromArrays(builder, labyrinthTab);
        System.out.println("-----------");
        System.out.println(builder.Build());


        }


        public static void makeFromFile(LabyrinthBuilder builder, String fileName){

            try(Scanner scan = new Scanner(new File(fileName))) {
                builder.start();
                int lig = 0;
                while (scan.hasNextLine()){
                    String line = scan.nextLine();
                    for(int col = 0; col < line.length(); col++){
                        char c = line.charAt(col);
                        switch (c) {
                            case 'm' -> builder.addMur(lig,col);
                            case '.' -> builder.addPiece(lig,col);
                            case 'p' -> builder.addPorte(lig,col);
                        }

                    }
                    lig++;
                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }

        }

        public static void makeFromArrays(LabyrinthBuilder builder, ElementLabyrinth[][] laby){
            builder.start();
            for (int lig = 0; lig < laby.length; lig ++) {
                for (int col = 0; col < laby[lig].length; col++) {
                    if (laby[lig][col] instanceof Piece) {
                        builder.addPiece(lig, col);
                        }
                        else if (laby[lig][col] instanceof Porte) {
                        builder.addPorte(lig,col);
                        }
                        else if (laby[lig][col] instanceof Mur) {
                            builder.addMur(lig,col);
                        }
                }
            }


        }


}
