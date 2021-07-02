package Day55_Abstraction.flags;

import java.awt.*;

public class FlagDrawing {
    public static void main(String[] args) {

        Grid grid = new Grid();
        System.out.println(grid);


        RussianFlag russianFlag = new RussianFlag();
        russianFlag.draw();

        UkrainianFlag ukraine = new UkrainianFlag();
        ukraine.draw();

        FrenchFlag france = new FrenchFlag();
        france.draw();

        AfFlag afFlag = new AfFlag();
        afFlag.draw();
    }
}
