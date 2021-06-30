package Day50_Inheritance;

public class staticBlockTest {
    public static void main(String[] args) {

        staticBlockDemo nObject = new staticBlockDemo();
        staticBlockDemo nObject1 = new staticBlockDemo();
        staticBlockDemo nObject2 = new staticBlockDemo();

        System.out.println("nObject = "  + nObject2.num);

        staticBlockDemo nObject3 = new staticBlockDemo(50);
        System.out.println("nObject3 = " + staticBlockDemo.num);


    }
}
