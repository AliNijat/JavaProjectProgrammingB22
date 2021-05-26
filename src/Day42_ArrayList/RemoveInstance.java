package Day42_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveInstance {
    public static void main(String[] args) {

        List<Integer> ins = new ArrayList<>(Arrays.asList(3,4,3,3));
        Integer num = 4;
        System.out.println(removeInst(ins, num));
    }

    public static ArrayList<Integer> removeInst(List<Integer> ins, Integer num) {
        ArrayList<Integer> newArr = new ArrayList<>();
        for (int i = 0; i < ins.size(); i++) {

            if (ins.get(i) != num){
                newArr.add(ins.get(i));
            }
        }
      //  System.out.println(newArr);
        return newArr;
    }
}
