package Day57_Interface_Polymorphism.Shape;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {

        Shape triangle = new Triangle();
        triangle.draw();

        Shape circle = new Circle();
        circle.draw();

        Shape square = new Square();
        square.draw();

        Shape shape = new Triangle();
        shape.draw();
        shape = new Circle();
        shape.draw();
        shape = new Square();
        shape.draw();

        System.out.println();

        List<Shape> shapes = new ArrayList<>();
        shapes.add(triangle);
        shapes.add( new Square());
        shapes.add( new Circle());
        shapes.add( new Triangle());
        shapes.add( new Square());
        shapes.add( new Circle());
        shapes.add( new Triangle());
        shapes.add( new Square());

        // System.out.println(shapes);
        for (Shape eachShape : shapes ) {
            eachShape.draw();
        }

        System.out.println("Calling method ...");
        drawShape(new Circle());
        drawShape(new Square());
        drawShape(new Triangle());
    }

    // a static method to accepts object of shape
    public static void drawShape(Shape shape){
        shape.draw();
    }
}
