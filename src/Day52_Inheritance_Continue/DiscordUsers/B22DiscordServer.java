package Day52_Inheritance_Continue.DiscordUsers;

public class B22DiscordServer {

    public static void main(String[] args) {

        User user = new User();
        user.setId(1234);
        user.setName("Nijat");
        user.setRole("Student");
        System.out.println(user);

        System.out.println();

        Admin admin = new Admin();
        admin.setRole("Teacher");
        admin.setName("Ali");
        admin.setId(43233);
        System.out.println(admin);

        System.out.println();

        Admin admin1 = new Admin( "Gullia", 4445);
        System.out.println(admin1);


    }
}
