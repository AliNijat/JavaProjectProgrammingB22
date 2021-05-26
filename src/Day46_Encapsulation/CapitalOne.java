package Day46_Encapsulation;

public class CapitalOne {
    public static void main(String[] args) {

        CheckingAccount acc = new CheckingAccount();

        acc.setAccountHolderName("Ali Nijat");
        acc.setAccountNumber(236869387);
        acc.setBalance(489238);

        System.out.println(acc);
    }
}
