package Day42_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

/*
The **search** method accepts `ArrayList of Strings` and `String find`.
The method returns a `String`.

It will look for an element within ArrayList that contains value of `find`

- if it finds it, methods needs to return whole Element value.
- if  an instance of find doesn't exist return:"search failed"

Example:

```
search(["one apple","two orange","four banana"],"four")

returns:
"four banana"

("four banana" contains "four" so method returns "four banana")
```
```
search(["hello","world"],"goodbye")

returns:
"search failed"

(no "goodbye" in any element)
```

hint: use `contains` string method to test if element has `word` value in it.

 */
public class Search {
    public static void main(String[] args) {


        ArrayList<String> r = new ArrayList<>(Arrays.asList("one apple","two orange","four banana"));
        String find = "one";
        String result = "";
        for ( int i = 0; i < r.size(); i++ ) {
            if (r.get(i).contains(find)) {
                result = r.get(i);
            }
            if (!r.get(i).contains(find)) {
                System.out.println("search failed");
            }
            System.out.println(result);
        }
    }

    // method
    public static String search(ArrayList<String> r, String find) {
        // complete the method
        String result = "";
        for ( int i = 0; i < r.size(); i++ ) {
            if (r.get(i).contains(find)) {
                result = r.get(i);
                return result;
            }
        }

        return "search failed";


    }
}
