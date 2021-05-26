package Replit_And_Practice_Tasks.Methods_Tasks;
/*
Create a method that has two parameters of an array of strings and a string and should returns an int.

It counts how many times the given string appears in the array and returns the count.

for example (pseudo code):

array = ["a","foo","bar","foo","bla"]
string = "foo"

countAppearance(array , string ) -> 2
 */
public class CountAppearsStringInArray {
    public static void main(String[] args) {

        String arr[] = {"java", "code", "python", "code", "rust", "code", "rust"};
        String t = "rust";

        int countApp = countApprearance(arr, t);
        System.out.println(countApp);
    }
    public static int countApprearance (String [] arr, String t){
        int count = 0;

        for (int i = 0; i < arr.length ; i++) {

            if (arr[i].equalsIgnoreCase(t)){
                count ++;

            }
        }
        return count;
    }
}
