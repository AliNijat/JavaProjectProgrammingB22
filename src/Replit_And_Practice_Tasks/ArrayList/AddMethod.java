package Replit_And_Practice_Tasks.ArrayList;

import com.sun.org.apache.xerces.internal.xs.StringList;
import com.sun.xml.internal.stream.StaxXMLInputSource;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/*
We will be manipulating elements of an ArrayList by using List methods.

The first List method we will learn is `.add()`

The following code will take an ArrayList of Strings called strs and add "Hello" to it.

```
strs.add("Hello");
```

The syntax is:

```
arraylistvariable.add(data_to_add);
```

Add three names (any names) to the ArrayList called names.
 */
public class AddMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List <String> str = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
          str.add(input.nextLine());
        }
        addMethod(str);


    }

    public static void addMethod(List<String> names) {

        for ( int i = 0; i < 3 ; i++) {
        }

        // Do not touch below
        System.out.println(names.size() + " = " + names);
    }
}
