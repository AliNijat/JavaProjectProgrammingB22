package Day07_Arithmetic_Operators_Continue;



public class StringConcatenation {
    public static void main(String[] args) {

        String out = "Java + 5 + 3";
        System.out.println(out);

        // 1. if some addition comes after a string with concatenation it will be only concat not adding
        System.out.println("java" + 5 + 3);
                           // java5
                           // java53

        // 2. if some adding comes before concat with a string, it will do math adding then attach with string
        System.out.println(5 + 3 + "java");
                           // 5+3 = 8
                           // 8java

        System.out.println(5 + (3 + "java"));
                            // 5
                            // 53
                            // 53java

        // 3. if a string comes between to addition, it will use the two roles for  "2" before and "1" after string
        System.out.println(5 -3 + "java" + 4 + 1);
 }
}

