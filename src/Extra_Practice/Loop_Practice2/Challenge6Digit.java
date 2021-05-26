package Extra_Practice.Loop_Practice2;

import java.util.Random;

public class Challenge6Digit {
    public static void main(String[] args) {

        Random random = new Random();

        String randomList = "0289639263";

        String pass6digit = "";
        int i = 0;

        while (i <  6){
            int index = random.nextInt(10);
            if (!pass6digit.contains(randomList.charAt(index)+ "")){
                pass6digit += randomList.charAt(index) + "";
                i ++;

            }
        }
        System.out.println(pass6digit);



    }
}
