package Day48_Constructor_Static;

public class Group_18 {
    public static void main(String[] args) {

        Group groupName = new Group("wooden_Spoon");
        groupName.addMember("Baz");
        groupName.addMember("Ogutal");
        groupName.addMember("Pavel");
        groupName.addMember("Ramil");
        groupName.addMember("Azimov");
        groupName.addMember("John");

        System.out.println("Size = " + groupName.getMembers().size());
        System.out.println(groupName);
    }
}
