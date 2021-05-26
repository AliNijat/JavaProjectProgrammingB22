package Day34_Custom_Methods;

public class FirstMyCustomMethod {
    public static void main(String[] args) {
        firsCall(); // like this we called methods

        for (int i = 1; i < 10; i++) {
            firsCall();
        }
    }

    // first custom reusable method
    public static void firsCall(){
        System.out.println("Hello B22 Friends!");
    }


}
