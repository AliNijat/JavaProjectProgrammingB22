package Day19_Classs_VS_Object_Strings;

public class StrStartsEndsWith {
    public static void main(String[] args) {

        String word = "intellij Idea";
        System.out.println(word.startsWith("i"));
        System.out.println(word.startsWith("in"));
        System.out.println(word.startsWith("intellij"));
        System.out.println(word.startsWith("intellij Idea"));
        System.out.println(word.endsWith("Idea"));

        System.out.println();


    }
}
