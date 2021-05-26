package Day27_For_Loop_Countiue;

public class ReadStringPortion {
    public static void main(String[] args) {

        String list = "cat,car,cat,red,car,java,selenium";

        for (int i = 0; i < list.length() - 2; i++) {
            String result = list.substring(i, i + 3);
           // System.out.println(result);
            if (result.equals("cat") ){
                System.out.println("found => " + result);
            }else if (result.equals("car")){
                System.out.println("found => " + result);
            } else {
                System.out.println(result + " =>  ?");
            }
        }
    }
}
