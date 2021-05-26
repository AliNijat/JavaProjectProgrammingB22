package Replit_And_Practice_Tasks.Methods_Tasks;
/*
Create a method **reverseNoSpec(String)** that will reverse a string without affecting special characters

Given a string, that contains special character together with alphabets (‘a’ to ‘z’ and ‘A’ to ‘Z’), reverse the string in a way that special characters are not affected.



```
Input:   str = "a,b$c"
Output:  str = "c,b$a"
Note that $ and , are not moved anywhere.
Only subsequence "abc" is reversed.
```
```
Input:   str = "Ab,c,de!$"
Output:  str = "ed,c,bA!$"
```

```
Input:   str = "----qwe--r--tyf...gd.---"

Output:  str = "----dgf--y--tre...wq.---"
```
 */
public class ReverseLetters {
    public static void main(String[] args) {


        String str = "Ab,c,de!$";
        String reversed = "";

        for (int i = str.length()-1; i >=0; i--) {

            if (str.charAt(i) >= 'A' || str.charAt(i) <= 'Z'){
                reversed += str.charAt(i);
            }

        }

        System.out.println(reversed);


        System.out.println(reverseNoSpec(str));

    }

    public static String reverseNoSpec(String str) {

        // your code here
        char [] strArr = str.toCharArray();
        String letter = "";
        for(char each : strArr){
            if(Character.isLetter(each)){
                letter += each+""; } }
        String reverseStr = "";
        for(int i = letter.length()-1; i >= 0; i--){
            reverseStr += letter.charAt(i); }
        String result = "";
        for(int i = 0, j=0;i < str.length(); i++){
            if(Character.isLetter(str.charAt(i))){
                result += reverseStr.charAt(j);
                j++;
            }else{
                result += str.charAt(i);
            }
        }
        return result;



    }
}
