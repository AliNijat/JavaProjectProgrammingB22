package Day50_Inheritance;

public class staticBlockDemo {
    static  int num;
    static {
        System.out.println("static initializer block");
        num = 10;
    }


    { // initializer block
        System.out.println("initializer block");
    }

    public staticBlockDemo(){
        System.out.println("Constructor method");
        num +=5;
    }

    public staticBlockDemo(int n){
        System.out.println("Overloaded class");
    }
}
