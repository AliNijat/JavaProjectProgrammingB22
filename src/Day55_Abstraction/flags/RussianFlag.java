package Day55_Abstraction.flags;
import java.awt.*;

public class RussianFlag extends Flag {

    @Override
    public void draw() {
        Grid grid = new Grid();

        for(int col=0;col<grid.getHt();col++){
            for(int row=0;row<grid.getWd();row++){
                if(row<grid.getWd()/3 ){
                    grid.setColor(col, row, Color.WHITE);
                }else if(row<grid.getWd()/3*2){
                    grid.setColor(col, row, Color.BLUE);
                }else{
                    grid.setColor(col, row, Color.RED);
                }
            }
        }
    }
}