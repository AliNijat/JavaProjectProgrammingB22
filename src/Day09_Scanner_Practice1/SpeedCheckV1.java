package Day09_Scanner_Practice1;

public class SpeedCheckV1 {
    public static void main(String[] args) {

        int speedLimit = 25;
        int currentSpeed = 25;
        int overSpeed = currentSpeed - speedLimit;
        if (speedLimit == currentSpeed){
            System.out.println("You are a good driver! ");
        }else {

            System.out.println("You are driving too fast >> \"" + overSpeed + " MPH\", over the limit. Slow down!");
        }


    }
}
