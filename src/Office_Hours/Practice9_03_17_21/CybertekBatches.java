package Office_Hours.Practice9_03_17_21;

public class CybertekBatches {
    public static void main(String[] args) {

        String batchType = "";

        // This is a multi if branch statements
//        if (batchType.equals("US") || batchType.equals("us")){
//
//        }else if (batchType.equals("EU") || batchType.equals("eu")){
//
//        }else {
//            System.out.println("This is invalid batch type");
//        }

        // This a nested if multi branch if statements
        if (batchType.equals("US") || batchType.equals("us")){
            boolean isMorning = false;
            if (isMorning){
                System.out.println("Class time are 10 - 5 EST. M, T, Th, F.");
            }else {
                System.out.println("Class time are 17 - 10 EST. M, T, w, S, S.");
            }

        }else if (batchType.equals("EU") || batchType.equals("eu")){
            System.out.println("Class time are 10 - 5 EST. M, T, Th, F.");

        }else {
            System.out.println("This is invalid batch type");
        }

    }
}
