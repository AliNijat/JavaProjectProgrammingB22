package Day53_Inheritance.Hiding;

public class Mobile extends Phone{
    String type = "Mobile phone";

    public static void use(){
        System.out.println("Using the mobile phone");
    }

    public void text(){
        use();
        System.out.println("and sending a text message");
    }

    @Override
    public void call(){
        use();
        System.out.println("and calling on mobile");
    }
}
