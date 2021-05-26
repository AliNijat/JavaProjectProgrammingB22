package Day22_String_Menipulation_Continue3;

public class IndexOf {
    public static void main(String[] args) {


        String technologies = "java, html, css, selenium, testNG, maven and cucumber";
        System.out.println(technologies.indexOf("java"));

        System.out.println(technologies.lastIndexOf(","));
        System.out.println(technologies.indexOf(", c"));
        System.out.println(technologies.indexOf(", m"));
        System.out.println(technologies.indexOf(", h"));

        int indexOfJava = technologies.indexOf("java");
        System.out.println("java is at index " + indexOfJava);

        int indexOfCUC = technologies.indexOf("cucumber");
        System.out.println("java is at index " + indexOfCUC);

        String word = "Hello";
        System.out.println(word.indexOf("h"));
        System.out.println(word.indexOf("el"));
        System.out.println(word.indexOf("lo"));
        System.out.println(word.indexOf("ll"));




    }
}
