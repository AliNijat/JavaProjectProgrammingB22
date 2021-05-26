package Day38_Recursion_Methods;

public class RecursionMethod {
    public static void main(String[] args) {

        starts();
        System.out.println();
        continues();
        System.out.println();
        end();


       crazyMethod(1);
    }
    public static void crazyMethod(int num){
        System.out.println(num + " ");
        num++;
        if (num < 101){
            crazyMethod(num);
        }

    }

    public static void starts( ){
        System.out.println("start");
        continues();
    }
    public static void continues( ){
        System.out.println("continue");
        end();
    }
    public static void end( ){
        System.out.println("end");
     //   starts();
    }
}
