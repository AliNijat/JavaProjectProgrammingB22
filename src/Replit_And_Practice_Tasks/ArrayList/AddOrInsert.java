package Replit_And_Practice_Tasks.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
The last ArrayList method we are going to learn is... .add() again!

Except this time, instead of .add() taking one parameter (the thing we want to add), this time, we will be giving it two parameters.  The two parameters are:

```
.add(i,element)
```

```
i ==> the index you want to insert at

element ==> the element you want to insert at index i
```

For example, if you had an ArrayList called nums with the values (4,2,5,6), and you run the following:

```
nums.add(1,100);
```

The result will be (4,100,2,5,6)

Task: Given an ArrayList of Strings called words, insert "hey" in the 0th index and then insert "yo" in the 3rd index.
 */
public class AddOrInsert {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(4,-6,3,-8,0,4,3));

        System.out.println(appendPosSum(list));

    }

    public static List<Integer> appendPosSum(List<Integer> list) {
        int sum = 0;
        List<Integer> postiveNums = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i) > 0){
                postiveNums.add(list.get(i));
              sum += list.get(i);
            }

        }
        postiveNums.add(sum);
       // System.out.println(postiveNums);
        //System.out.println(sum);
        return postiveNums;
    }
}
