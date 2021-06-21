package Day49_Static_Examples;

public class BankAccountTest {
    public static void main(String[] args) {

        // these are static variable that why every new objects is links to the variable
        MyBankAccount husband = new MyBankAccount();
        husband.user = "Nijat";
        husband.showBalance();
        husband.spend(130.99);
        husband.showBalance();

        MyBankAccount wife = new MyBankAccount();
        wife.user = "Tahira";
        wife.spend(230);
        wife.showBalance();

        System.out.println("$" + MyBankAccount.balance);


    }
}
