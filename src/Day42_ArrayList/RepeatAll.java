package Day42_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Create a static method that:

- is called `repeatAll`
- returns `ArrayList of Booleans`
- takes in a single parameter - an `ArrayList of Booleans`

This method should modify its ArrayList parameter by repeating its ArrayList values.

For example, if the parameter is

```
(true, false, false)
```

The modified ArrayList should be

```
(true, false, false, true, false, false)
 */
public class RepeatAll {
    public static void main(String[] args) {

        ArrayList<Boolean> blo = new ArrayList<>(Arrays.asList(true, false, false, true));

        System.out.println(repeatAll(blo));

    }

    private static ArrayList<Boolean> repeatAll(ArrayList<Boolean> blo) {
        ArrayList<Boolean> newBlo = new ArrayList<>();

        for (int i = 0; i < blo.size(); i++) {

            newBlo.add(blo.get(i));

        }
        newBlo.addAll(newBlo);
       // System.out.println(newBlo);
        return newBlo;
    }

    public static List<Boolean> repeatAll2 (ArrayList<Boolean> cases) {
        List<Boolean> result = new ArrayList<Boolean>();
        for (int j = 0; j < 2; j++) {
            for (int i = 0; i < cases.size(); i++) {
                result.add(cases.get(i));
            }
        }

        return result;
    }
}
