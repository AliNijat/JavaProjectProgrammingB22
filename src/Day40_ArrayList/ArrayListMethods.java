package Day40_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods {
    public static void main(String[] args) {

        List<String> shoppingList = new ArrayList<>();

        System.out.println("size = " + shoppingList.size());
        System.out.println("isEmpty? = " + shoppingList.isEmpty());

        if (shoppingList.isEmpty() && shoppingList.size() == 0){
            System.out.println("List is empty, keep doing java");
        }else {
            System.out.println("List is not empty, code java then go to Oaks Mall");
        }



    }

}
