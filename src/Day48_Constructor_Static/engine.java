package Day48_Constructor_Static;

public class engine {
    int cylinders;

    public engine(){

    }

    public engine(int cylinders) {
        this.cylinders = cylinders;
    }

    @Override
    public String toString() {
        return "engine{" +
                "selinder=" + cylinders +
                '}';
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setSelinder(int cylinders) {
        this.cylinders = cylinders;
    }
}

