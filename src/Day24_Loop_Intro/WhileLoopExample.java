package Day24_Loop_Intro;

public class WhileLoopExample {
    public static void main(String[] args) {

        int apples = 0;

        if (apples <= 10){
            System.out.println("if Apples" + apples);
        }else {
            System.out.println("Apples finished?");

        }
        System.out.println("__________VVVV_________");

        // Loop == repeating the condition
        // While 1/3 Loops and opposite of if statements
        while (apples <= 10){
            System.out.print( apples + " Apples ");
            apples ++;
        }
        System.out.println();
        System.out.println("No more apple?");
        System.out.println("__________^^^^_________");


        // example
        int second = 0;
        while (second <= 117){
            System.out.print(" Watching the video " + second);
            second ++;
        }
        System.out.println();
        System.out.println("Finished video");
        System.out.println("__________^^^^_________");





    }
}
