package Day14_MultiBranch_IfStatemens;

public class CalculatorV1 {
    public static void main(String[] args) {

        // Scanner scan = new Scanner(System.in);

        char operators = 'n';
        double num1 = 12, num2 = 20;

        // char operators = scan.next(); scan.nextChar('*');

        if ( operators == '+'){
            System.out.println("Sum of " +( num1 + num2));
        }else  if ( operators == '-'){
            System.out.println("Substruc of " +( num1 - num2));
        }else if ( operators == '*'){
            System.out.println("Multi of " +( num1 * num2));
        }else if ( operators == '/'){
            System.out.println("Division of " +( num1 / num2));
        }else {
            System.out.println("Invalid operator.\nValid operators are: +, -, *, / ");
        }

        // if we calculate some small amount to bigger the result will be negative, so we can cast it to get whole number.
        double example = 119879 - 2000000;
        float example1 = 200000 / 1000.500f;
        System.out.println((int) example);
        System.out.println((int) example1);

        int example2 = 11 - 20;
        System.out.println((double) example2);




    }
}
