package Day42_ArrayList;

import java.util.ArrayList;
/*
_This task is optional, since we did not practice ArrayLists in this way._

`blogDb` gets an `ArrayList` `of String Arrays(ArrayList<String[]>)` from a database, each row from the database table is represented by a position in the ArrayList. each ArrayList position holds a string array that holds the row data.

the database table columns are : id(string),title(string), content(string).

**ArrayList<String[]> r** example:

_Each item in ArrayList is a String Array_

```
r = [
["1","title","content1"],
["2","another title","content2"],
["3","yet another title","content3"]
]
```

the **String id** argument of **blogDb** method is referring to a row from the table the arraylist holds.

You need to loop through each element in the ArrayList and find the matching String[] with that id.

Then return the title and content in the format below.

Example:

```
blogDb(r,"1")

returns:
title
content1
```

```
blogDb(r,"2")

returns:
another title
content2
 */
public class blogDb {
    public static void main(String[] args) {


    }
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
