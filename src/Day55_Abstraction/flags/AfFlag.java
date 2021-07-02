package Day55_Abstraction.flags;

import java.awt.*;

public class AfFlag extends Flag{

    @Override
    public void draw() {
        Grid grid = new Grid();

            for(int col=0;col<grid.getWd();col++){
                for(int row=0;row<grid.getHt();row++){
                if(col<grid.getWd()/3 ){
                    grid.setColor(row, col, Color.BLACK);
                }else if(col<grid.getWd()/3*2){
                    grid.setColor(row, col, Color.RED);
                }else{
                    grid.setColor(row, col, Color.GREEN);
                }

            }

        }
    }
}
