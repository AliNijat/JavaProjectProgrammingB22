package Day42_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

/*
In this assignment you will swap a position in an array list with another.

**swap()** gets 3 arguments, `an Arraylist`, `a position`, and `another position` to swap with.

Example

```
swap(["one","two","three"],0,2)

returns:["three","two","one"]
```

```
swap(["a","c","b","d","e"],0,3)

returns:["d","c","b","a","e"]
 */
public class swap {
    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("one", "two", "three"));
        System.out.println(swap(list1, 0, 1));
    }
    public static ArrayList<String> swap(ArrayList<String> list, int pos1, int pos2) {

        ArrayList<String> newArr = new ArrayList<>();
       list =  swap(list, pos1, pos2);

        return list;

    }
}
