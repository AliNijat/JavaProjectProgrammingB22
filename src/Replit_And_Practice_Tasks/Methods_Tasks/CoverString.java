package Replit_And_Practice_Tasks.Methods_Tasks;

import java.util.Arrays;

/*
The **coverString** method will take 2 string parameters from the caller.

Your job is to write an important code that will :

- to search and find each appearance of `coverME` within `main`

- then surround it with square brackets [coverMe]

- if you cannot find the `coverME` within `main` then just return whole `main` itself covered [main].

- keep in mind that coverME value can be of any length.

Examples:

```
coverString("java methods", "me") ) ; ==> "java [me]thods"
```

```
coverString("Certified Wooden Spoon", "o") ) ; ==> "Certified W[o][o]den Sp[o][o]n"
```

```
coverString("hello hello", "ello") ) ; ==> "h[ello] h[ello]"
```

```
coverString("apples", "pears") ) ; ==> "[apples]"
```
 */
public class CoverString {
    public static void main(String[] args) {

        String main = "java Methods";
        String coverMe = "Me";

        String result = coverString(main, coverMe);
        System.out.println(result);

    }

    public static String coverString(String main, String coverMe) {
        // your code here

        String result = "";

        if (main.contains(coverMe)) {
            result = "[" + coverMe + "]";
            main = main.replace(coverMe, result);
            return main;
        } else {
            return "[" + main + "]";
        }

    }

    public static void coverString2(String main, String coverMe) {
        char[] arr = main.toCharArray();
        char[] arr1 = coverMe.toCharArray();
        // System.out.println(Arrays.toString(arr) + Arrays.toString(arr1));

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == (arr1[i])) {
                //coverMe ;
            }

        }
    }
}
