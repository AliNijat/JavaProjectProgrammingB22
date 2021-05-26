package Day36_Methods_With_Parameter;

import java.util.Random;

public class Info {
    public static void main(String[] args) {

        fullName();
        String fullName = fullName();

        isMarried();
        boolean married = isMarried();

       int age =  getAge(2021, 1989);
       // int age = getAge();

        getRandomYear();
        int randomYear = getRandomYear();

        System.out.println("Full name: " + fullName);
        System.out.println("Marriage status: " + married);
        System.out.println("Birth year: " + randomYear);
        System.out.println("Age: " + age);
//        //System.out.println("random year " + randomYear);
//
//        System.out.println("Full name: " + fullName + "\nmarried? "
//                + isMarried() + "\nAnd his age is: " + getAge() + "\nBorn year: " + randomYear);
//
//        System.out.println("OOOH, you are " + (2021 - randomYear ) + " years old?");

    }
    public static String fullName (){
        //System.out.println("I have the name in return method");
        return  "Ali Nijt";
    }
    public static boolean isMarried (){
        //System.out.println("Boolean is used for marriage status");
        return false;
    }
    public static int getAge (int currentYear, int birthYear){
      //  System.out.println("Age is here show");
        int age = currentYear - birthYear;
        return age;
    }

    public static int getRandomYear(){
        Random num = new Random();
        int randomYear = num.nextInt(2021);
        return randomYear;
    }

}
