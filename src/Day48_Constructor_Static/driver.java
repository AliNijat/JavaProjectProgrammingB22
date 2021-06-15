package Day48_Constructor_Static;

public class driver {
    private String name;

    public driver(){

    }

    public driver(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "driver{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
