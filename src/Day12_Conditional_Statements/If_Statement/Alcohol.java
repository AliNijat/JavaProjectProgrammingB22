package Day12_Conditional_Statements.If_Statement;
import java.util.Scanner;
public class Alcohol {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("How old r u?");
            int old = scan.nextInt();

            if (old > 21) {
                System.out.println("Yes you can buy alcohol, and enjoy");
            } else {
                System.out.println("Ops, You can buy milk and enjoy babe! ");
            }
        }
}
