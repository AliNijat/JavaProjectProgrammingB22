package Day47_constructors;

public class MyAddress {
    public static void main(String[] args) {

        Address myAdd = new Address();
        myAdd.setStreet("847 barrel cooper");
        myAdd.setCity("Reston");
        myAdd.setState("VA");
        myAdd.setZipCode(20122);
        myAdd.setCountry("USA");

        System.out.println("My Address: " + myAdd.toString());

        myAdd.setStreet("7389 NowAbad road");
        System.out.println("New address: " + myAdd);

        Address newAdd = new Address();
        System.out.println(newAdd.toString());

        Address papaJohn = new Address("123 shdk ", "dhs", "sddkj", 123, "eirdj");
        System.out.println("papaJohn = " + papaJohn.toString());

    }
}
