package Day52_Inheritance_Continue.DiscordUsers;

public class Admin extends  User{

    public Admin(){
        System.out.println("Admin class constructor!");
    }

    public Admin(String role, String name, int id) {
        super(role, name, id);
    }

    public String toString(){
        return "Admin{" +
                "role='" + getRole() + '\'' +
                ", name='" + getName() + '\'' +
                ", id=" + getId()+
                '}';
    }

}
