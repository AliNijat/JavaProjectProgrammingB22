package Day01_Java_Intro;

public class HelloWorld {
    public static void main(String[] args) {

        System.out.print("Hello My Friends!☻♥☺");
        System.out.println();
        System.out.println("Hello, My name is Ali, living in Chantilly VA");

        System.out.println("methods(\"apple\") = " + methods("apple"));
        int arr [] = {7, 3, 8, 20, 14};
        meth(arr);
    }
    public static  boolean methods(String sre){
        boolean check = true;

        if (sre.isEmpty()){
            check = false;
        }
        if (sre.contains("a")){
            check =false;
        }else if (sre.contains("z")){
            check = false;
        }
        return check;
    }

    public static void meth(int [] rr){
        for ( int n: rr ) {
            if (n % 2==0){
                continue;
            }
            System.out.println(n);
        }
    }
}
