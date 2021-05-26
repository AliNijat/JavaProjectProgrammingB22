package Day28_Loop_Practice;

public class FindingUniqueChar {
    public static void main(String[] args) {

        String word = "java";
        String nonDupl = "";

        for (int i = 0; i <= word.length()-1; i++){
            if (!nonDupl.contains(word.charAt(i)+"")) {

                nonDupl += word.charAt(i);
            }
        }
        System.out.println("duplicate = " + nonDupl);

    }
}
