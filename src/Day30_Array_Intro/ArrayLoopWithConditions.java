package Day30_Array_Intro;

public class ArrayLoopWithConditions {
    public static void main(String[] args) {

        double[] prices = {22.9, 12.4, 43.12, 65.0, 100.4, 543.23, 98.32, 533.43, 34.23, 124.9, 234.23};
        String[] countries = {"Afghanistan", "Brazil", "China", "Cuba", "Sweden", "France", "Vietnam", "Albania",
                "Brazil", "Portugal", "China", "Philippines", "Philippines", "China", "Philippines", "China", "Armenia",
                "Philippines", "China", "Colombia", "Philippines", "Honduras", "Indonesia", "Brazil", "China", "United States", "Russia"};

        for (double each : prices) {
            if (each >= 100) {

                System.out.print(each + " ");
            }
        }
        System.out.println();
        System.out.println("----------------------------------------------");

        for (double each : prices) {
            if (each >= 10 && each <= 70) {

                System.out.print(each + " ");
            }
        }
        System.out.println();
        System.out.println("----------------------------------------------");

        for (int i = 0; i <= prices.length - 1; i++) {
            if (prices[i] >= 100) {
                System.out.print(prices[i] + " ");
            }
        }
        System.out.println();

        int count = 0;
        for (double each : prices) {
            if (each >= 50) {
                count++;
                // System.out.print(each + " ");
            }

        }
        System.out.println("Count is: " + count);

        System.out.println();
        System.out.println("----------------------------------------------");

        for (String each : countries) {
            if (each.length() > 7) {
                System.out.println(" countries = " + each + " ==> " + each.length() + " ");
            }
        }


    }
}
