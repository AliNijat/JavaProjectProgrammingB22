package Office_Hours.Practice10_04_19_21;

public class MethodClass {

    /**
     Methods:
     *Declaring + *Calling --> Parameter
     1, void--> runs a block of code, but there is no a return value
              Arrays.sort() -> takes an array, sorts it, doesn't return anything

     2. return -> runs a block of code, but there is a return value
     Arrays.binarySearch() -> takes an array and element,
     tries to find the element, returns the index of the element
     */
    public static void main(String[] args) {


    }
    public static void methodOne(){
        System.out.println("one");
    }
    public static String methodTwo(){
        return "two";
    }
    public static int methodThree(String word){
        return word.length();
    }
    public static boolean login (String userName, String Password){
        return true;
    }
}
