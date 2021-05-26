package Day20_StringMenipulation_PracticeContinue;

public class StringContains {
    public static void main(String[] args) {

        String company = "Capital one";

        System.out.println(company.contains("i")); // true
        System.out.println(company.contains(" one")); // true
        System.out.println(company.contains("l o")); // true

        if (company.contains(" ")) {
            System.out.println("It's contain in '" + company + "' word");
        } else {
            System.out.println("It is not contain in " + company);
        }

        System.out.println(company.contains("c")); // false
        System.out.println(company.contains("O")); // false
        System.out.println("-------------------------------------");

        String estyTitle = "Wooden spoon | Esty";
        if (estyTitle.contains("|")) {
            System.out.println("Pass - title check passed");
        } else {
            System.out.println("Fail - title check failed");
        }

        String name = "Ali Nijat";
        if (name.contains("a") || name.contains("e")) {
            System.out.println("Both a && e is present");
        } else {
            System.out.println("a || e not present");
        }

        name = "Nadir";
        if (name.contains("i")|| name.contains("a")){
            System.out.println("Hey guys, what I'm saying? ... Oh, he is Nadir:))");
        }else {
            System.out.println("Stay with me stay with me...:)) you know, who is he");
        }
    }
}
