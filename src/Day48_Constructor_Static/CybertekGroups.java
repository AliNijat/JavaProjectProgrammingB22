package Day48_Constructor_Static;

import java.util.Arrays;

public class CybertekGroups {
    public static void main(String[] args) {
        //dependency injection. Group object creation depends on String name
        Group group1 = new Group("Cyberbugs");
        //print size of members
        System.out.println(group1.getMembers().size());
        group1.addMember("Berk");
        group1.addMember("Pavel");
        group1.addMember("Elvin");
        group1.addMember("Ali");
        group1.addMember("Parvin");
        group1.addMember("Rasim");
        group1.addMember("Inthira");
        group1.addMember("Oogii");
        group1.addMember("Chrissy");
        group1.addMember("Hurshid");
        group1.addMember("Aziz");
        group1.addMember("Duraid");
        group1.addMember("Zuhal");

        System.out.println(group1.getMembers().size());
        System.out.println(group1.toString());

        //check if someone is in list but not in our group member then remove
        if (group1.getMembers().contains("Pavel")) {
            System.out.println("One bug found [" + group1.getMembers().get(1) + "] and Removed");
            group1.removeMember("Pavel");
        } else {
            System.out.println("No bugs are found!!!");
        }
        System.out.println(group1);


        Group group2 = new Group("CyberCats");
        group2.setMembers(Arrays.asList("Stephen", "Wakshum", "Akrem", "Bulent", "Andreea", "Andrei"));
        //print all members. not toString()
        //System.out.println("group2 members = " + group2.getMembers());
    }
}