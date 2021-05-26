package Day36_Methods_With_Parameter;

public class CreditScore {
    public static void main(String[] args) {
        checkEligible(400, "Micheal");
        checkEligible(789, "Aleksandar");
        System.out.println();

        int score = getCreditScore();
        System.out.println("Score = " + score);


    }
    public static void checkEligible (int creditScore, String name){

        if (creditScore >= 700){
            System.out.println(name + " Your are eligible for leasing this car, with " + creditScore);
        }else {
            System.out.println(name + " Sorry, you are not eligible for leasing this car, with " + creditScore);
        }
    }

    public static int getCreditScore(){
        return 800;
    }


}
