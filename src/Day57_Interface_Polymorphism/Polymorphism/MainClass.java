package Day57_Interface_Polymorphism.Polymorphism;

public class MainClass {
    public static void main(String[] args) {

        Animal animal = new Animal(); // Not polymorphism
        animal.makeNoise();

        // TODO ->> Polymorphism way, which Data type and object type is different
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();
        Animal animal3 = new Horse();

        animal1.makeNoise();
        animal2.makeNoise();
        animal3.makeNoise();

        // Dog dog = new Animal();  Not allowed
        // cat = new Dog();         Not allowed

        Horse horse = new Horse();//Okay



    }
}
