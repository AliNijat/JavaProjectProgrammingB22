package Day52_Inheritance_Continue.DiscordUsers;

public class Admin extends  User{

    public Admin(){
        System.out.println("Admin class constructor!");
    }

    public Admin( String name, int id) {
        super("Admin", name, id);
        System.out.println("Admin class 2 args constructor!");
    }

    public String toString(){
        return "Admin {" +
                " role =' " + getRole() + '\'' +
                ", name =' " + getName() + '\'' +
                ", id = " + getId()+
                '}';
    }

}
