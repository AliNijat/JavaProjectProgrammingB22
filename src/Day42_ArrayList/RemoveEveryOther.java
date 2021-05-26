package Day42_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

/*
 Create a method that:

- is called `removeEveryOther`
- returns `ArrayList of Strings`
- takes in a single parameter - an `ArrayList of Strings` called `words`

This method should take the ArrayList parameter and modify it by removing every other element in the list, starting with removing the 0th element.

For example, if the parameter is:

```
("hi","yo","sup","yolo","book")
```

The modified ArrayList should be:

```
("yo","yolo")
 */
public class RemoveEveryOther {
    public static void main(String[] args) {

        ArrayList<String> word = new ArrayList<>(Arrays.asList("hi", "yo", "sup", "yolo", "book"));
        System.out.println(removeEveryOther(word));
    }

    public static ArrayList<String> removeEveryOther(ArrayList<String> word) {
        ArrayList<String> newList = new ArrayList<>();

        for (int i = 1; i < word.size(); i+= 2) {
            newList.add(word.get(i));

        }
       // System.out.println(newList);

        return newList;
    }
}
