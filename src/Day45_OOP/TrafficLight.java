package Day45_OOP;

public class TrafficLight {
    String color;

    // this is read only method, displays value of color variable
    public void showColor(){
        System.out.println("Current color = " + color);
    }

    // this method updates the value of color variable
    public void changeColor(String newColor){
        if (newColor.equalsIgnoreCase("red") || newColor.equalsIgnoreCase("green")
                || newColor.equalsIgnoreCase("yellow")) {
            System.out.println("changing color to " + newColor);
            color = newColor;
        }else {
            color = newColor;
            System.out.println("ERROR: invalid color " + newColor);
        }
    }

    public  void action(){
        if (color.equalsIgnoreCase("green")){
            System.out.println("Go...!!!");
        }else if (color.equalsIgnoreCase("Yellow")) {
            System.out.println("Prepare for stop!");
        }else if (color.equalsIgnoreCase("red")){
            System.out.println("Stop!!!");
        }else {
            System.out.println("Move carefully, lights broken!!!");
        }
    }
}
