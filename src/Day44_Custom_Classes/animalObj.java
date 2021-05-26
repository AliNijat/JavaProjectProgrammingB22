package Day44_Custom_Classes;

public class animalObj {
    public static void main(String[] args) {

        animal animal = new animal();
        System.out.println(animal.type); //some animal
        animal.eat();
        animal.eat("grass");
        animal.speak();

        //create new Animal object  - cheetahObj
        animal cheetahObj = new animal();
        cheetahObj.type = "cheetah"; //change value/reassign to "cheetah"
        System.out.println(cheetahObj.type);
        cheetahObj.eat("kebab");
    }
}
