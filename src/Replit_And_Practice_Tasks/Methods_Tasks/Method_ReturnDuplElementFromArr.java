package Replit_And_Practice_Tasks.Methods_Tasks;

public class Method_ReturnDuplElementFromArr {


    public static int getDup(String []arr){

        String newArr [] = new String[arr.length];

        int count = 0;
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < newArr.length; j++) {
                newArr[j] = arr[i];

                if (arr[i].equals(newArr[j])) {
                    count++;
                }
            }
        }

        return count;
    }


    public static void main(String[] args) {

        String []arr = new String []{"1","2","aa","1"};
        System.out.println(getDup(arr));
    }
}
