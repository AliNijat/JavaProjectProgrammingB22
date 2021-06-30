package Day50_Inheritance.Overriding;

public class AnimalObject {
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.name = "Lion";
        animal.type = "Predator";
        System.out.println("Name: " + animal.name + ", Type: "+animal.type);
        animal.speak();

        System.out.println();

        Dog dog = new Dog();
        dog.name = "Mia"; dog.type = "German";
        System.out.println("Name: " + dog.name + ", Type: " + dog.type);
        dog.bark(); dog.speak();

        System.out.println();

        Cheatah cheatah = new Cheatah();
        cheatah.name = "Cheathah"; cheatah.type = "Predator";
        System.out.println("Name: "+ cheatah.name +", Type: " + cheatah.type);
        cheatah.speak(); cheatah.bark(); cheatah.run();

        System.out.println();

        Cat cat = new Cat();
        cat.name = "Beirly";
        cat.jump(); cat.speak();
    }
}
