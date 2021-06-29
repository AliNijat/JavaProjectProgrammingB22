package Office_Hours.Practice_06_15_21;

public class EmailObjects {

    public static void main(String[] args) {

        Email email = new Email("Anton@cybertekschool.com", 43);
        // email.ADDRESS = "email"; -> ADDRESS is final, can't be changed
        System.out.println( email);
        System.out.println(Email.domain);
        System.out.println(Gmail.domain);

        System.out.println();

        Gmail gmail = new Gmail("jamesbond@gmail.com", 133);
        System.out.println( gmail);
        System.out.println(Gmail.domain);
        System.out.println(Email.domain);

        System.out.println();

        yahoo yahoo = new yahoo("Mohammad@yahoo.com", 113);
        System.out.println( yahoo);
        System.out.println(yahoo.domain);
        System.out.println(Gmail.domain);
        System.out.println(Email.domain);

        System.out.println();

        yahoo.domain = "generic";
        System.out.println(yahoo.domain);
        System.out.println(Gmail.domain);
        System.out.println(Email.domain);

        System.out.println();

        Gmail.sendEmail();
        Gmail.sendEmail();
        Gmail.sendSuperEmail();

    }
}
