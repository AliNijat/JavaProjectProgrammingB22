package Day24_Loop_Intro;

public class LoopPractice1 {
    public static void main(String[] args) {

        int miles = 15;
        int time = 30;

        while (miles >= 0 && time >= 0){
            System.out.println( miles + " Miles, and " + time + " Minutes remain; ");

            miles --;
            time -= 2;
        }
        System.out.println("You arrived! ");


    }
}
