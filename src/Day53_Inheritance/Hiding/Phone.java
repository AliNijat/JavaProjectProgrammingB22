package Day53_Inheritance.Hiding;

public class Phone {

    String type = "Old school phone";

    // Method hiding ...
    public static  void use(){
        System.out.println("Using the phone");
    }
    public void call(){
        use();
        System.out.println("and making a phone call");
    }
}
