package Day46_Encapsulation;

public class Bird {
    private String type;
    private int age;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "type='" + type + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Bird bird = new Bird();
        System.out.println(bird);
    }
}
