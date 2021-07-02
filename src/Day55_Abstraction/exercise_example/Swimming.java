package Day55_Abstraction.exercise_example;

public class Swimming extends Exercise {

    @Override
    public void perform() {
        System.out.println("Performing swimming in a pool or ocean");
    }

    /**
     *
     * @param minutes - how long is exercise is performed
     * @return 
     */

    @Override
    public int getCaloriesCount(int minutes) {
        return minutes * 11;
    }
}
