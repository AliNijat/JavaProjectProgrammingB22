package Day48_Constructor_Static;

import java.util.ArrayList;
import java.util.List;

public class Group {

   private String groupName;
   private List<String> members;


   public void addMember (String newMember){
       members.add(newMember);
   }

   public void removeMember(String name){
       members.remove(name);
   }

    public Group(String groupName){
       this.groupName = groupName;
        members = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Group{" +
                "GroupName = '" + groupName + '\'' +
                ", members = " + members +
                '}';
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public List<String> getMembers() {
        return members;
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }


}
