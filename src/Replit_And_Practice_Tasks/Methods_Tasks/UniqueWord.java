package Replit_And_Practice_Tasks.Methods_Tasks;

/*
Complete the void method printUniqueWords() that will print only unique words from an array of strings. Every single unique word should be printed from the new line.

Example:

input:[java, code, python, code, rust, code, rust]

output:
java
python
 */
public class UniqueWord {
    public static void main(String[] args) {


        String words[] = {"java", "code", "python", "code", "rust", "code", "rust"};
        printUniquwWords(words);

        System.out.println("----------the second method----------------");
        String words1[] = {"java", "code", "python", "code", "rust", "code", "rust"};
        printUniquwWords2(words1);
    }

    private static void printUniquwWords(String[] words) {

        for (int i = 0; i < words.length; i++) {
            int count = 0;
            for (int j = 0; j < words.length; j++) {

                if (words[i].equalsIgnoreCase(words[j])) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(words[i]);
            }
        }
    }


    private static void printUniquwWords2(String[] words) {
    for( int i = 0; i < words.length; i++){
        boolean isUniq = true;
        for( int j = 0; j < words.length; j++){
            if(words[i].equals(words[j]) && i != j){
                isUniq = false;
            }
        }
        if(isUniq){
            System.out.println(words[i]);
        }
    }
}
    public static String [] fillArray(String str){
        String arr [] = str.split(" ");
        return arr;
    }
}
