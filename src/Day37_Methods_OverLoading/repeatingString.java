package Day37_Methods_OverLoading;

public class repeatingString {
    public static void main(String[] args) {
        repeatString("ʘ‿ʘ ", 5, '|');
        System.out.println("New word = " + repeatString(" ʘ‿ʘ ", 5, '|'));

    }
    public static String repeatString(String word, int time, char delimiter){
        String result = "";

        for (int i = 1; i <=time ; i++) {
            if (i == time){
                result += word;

            }else {
                result += word + delimiter;
            }
        }
        //System.out.println("Result = " + result);
        return result;
    }
}
