package Replit_And_Practice_Tasks.ArrayList;

import java.util.*;

/*
The ``.set()`` ArrayList method will set the value of a particular index to the given value.

Given the following ArrayList...

```
ArrayList<Integer> nums = new ArrayList<>();
nums.add(4);
nums.add(2);
nums.add(8);
nums.add(1);
nums.add(-1);
```

(the values of this arraylist are 4,2,8,1,-1)

The following code will set the element at the 2nd index to be 99 and the element at the 0th index to be 100.

```
nums.set(2,99);
nums.set(0,100);
```

Notice how it works:

```
arraylistvariable.set(index to set, new value);
```

Finish the code so the ArrayList will have `200 in index 1` and `50 in index 3`
 */
public class SetAndRemoveMethods {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();

    }

    /*

    The next ArrayList method we are going to learn is `.remove()`

    The `.remove(i)` method will remove the element at index i.  This means that all elements after index i will be shifted back to fill the hole left by the removal.

            **Task**: Finish code so that it will remove the first two elements in the given ArrayList of Integers (be careful, this is a little tricky!)

    Example:
    Say you had an ArrayList called nums with values (6,2,3,1,9,2,5).

            ```
            nums.remove(1);
    will result in (6,3,1,9,2,5).
            nums.remove(3);
nums.remove(3);

    will result in (6,3,1,5), because after the first remove(3) is run, the 2 and 5 get pushed up into the 3rd and 4th index, and then the second remove(3) will remove the 2, leaving the 5.
            ```

     */


}
