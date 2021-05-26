package Day45_OOP;

public class ComparingString {
    public static void main(String[] args) {

        String word1 = "java"; // create in string pool
        String word2 = "java"; // re-use from string pool
        String word3 = new String("java"); // create NEW Object in heap, outside string pool
        String word4 = new String("java");

        System.out.println(word1 == word2); // true
        System.out.println(word1 == word3); // false
        System.out.println(word3 == word4); // false

        System.out.println(word1.equals(word2)); // true
        System.out.println(word1.equals(word3)); // true
        System.out.println(word3.equals(word4)); // true
    }
}
