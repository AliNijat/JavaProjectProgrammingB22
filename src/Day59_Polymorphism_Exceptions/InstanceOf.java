package Day59_Polymorphism_Exceptions;

import Day57_Interface_Polymorphism.Shape.Circle;
import Day57_Interface_Polymorphism.Shape.Shape;
import Day57_Interface_Polymorphism.Shape.Square;

public class InstanceOf {

    public static void main(String[] args) {

        Shape shape = new Square();

        System.out.println(shape);
        System.out.println(shape instanceof Circle);
        System.out.println(shape instanceof Square);
        if (shape instanceof Circle){
            System.out.println("Circle object");
        }else if (shape instanceof Square){
            System.out.println("Square object");
        }

        System.out.println(shape.getClass().getSimpleName());

        WebElement el = new Link();
        ((Link)el).getLinkHref();
        ((InputField)el).getText();
        System.out.println(el.getClass().getSimpleName());
    }
}
