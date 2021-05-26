package Day13_Conditional_Statements;

import java.util.Scanner;

public class ATMPincodeProgram {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO TD BANK ATM!");
        System.out.println("Please enter your pincode");

        String secretPincode = "ABC432";
        String inputPincode = input.nextLine();

        if (secretPincode.equals(inputPincode)){
            System.out.println("You login to your account successfully");
            System.out.println("Please one of options:\n >Withraw Ckeck\n >balance\n >Deposite");
        }else {
            System.out.println("Pincode is wrong! Please try again");
        }

    }
}
