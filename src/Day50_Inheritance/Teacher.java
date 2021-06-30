package Day50_Inheritance;

public class Teacher extends Person {

    int teacherId;

    public void teach(String topic){
        System.out.println("Teacher #" + teacherId + "talking about topic " + topic);
    }
}
