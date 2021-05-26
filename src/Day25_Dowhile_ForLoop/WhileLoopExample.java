package Day25_Dowhile_ForLoop;

public class WhileLoopExample {
    public static void main(String[] args) {

        boolean isHungary = true;
        int banana = 0;
        int countToFail = 10;

        while (isHungary){
            banana ++;
            System.out.println("Easting banana: " + banana);
            //banana ++;

          //  isHungary = banana == countToFail ? true : false;
            if (banana == countToFail){

                isHungary = false;
            }
        }

        System.out.println("Had enough bananas, lets get beck to studying.");


    }
}
