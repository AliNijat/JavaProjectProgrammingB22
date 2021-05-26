package Day46_Encapsulation;

public class Car {

    private String make;
    private int year;
    private long mileage;

    // setter method for make
    public void setMake(String carMake) {
        make = carMake;
    }

    // getter method for make
    public String getMake() {
        return make;
    }

    public void setYear(int carYear) {
        year = carYear;
    }

    public int getYear() {
        return year;
    }

    public void setMileage(long mileage) {
        this.mileage = mileage;
    }

    public long getMileage() {
        return mileage;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", year=" + year +
                ", mileage=" + mileage +
                '}';
    }
}
