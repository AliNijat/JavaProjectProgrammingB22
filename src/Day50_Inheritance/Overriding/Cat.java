package Day50_Inheritance.Overriding;

import Day50_Inheritance.Overriding.Animal;

public class Cat extends Animal {

    public void jump(){
        System.out.println(name + " is jumping");
    }

    @Override
    public void speak(){
        System.out.println(name + " is meowing ... ");
    }
}
