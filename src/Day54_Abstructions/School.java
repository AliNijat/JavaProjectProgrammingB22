package Day54_Abstructions;

public class School {
    public static void main(String[] args) {

       // Student student = new Student(); TODO >> it is abstract class which cannot create object
                                                  //  because in parent class are not any implitention

        OnlineStudent onlineStudent = new OnlineStudent();
        onlineStudent.attendClass();

        CampusStudent campusStudent = new CampusStudent();
        campusStudent.attendClass();

    }
}
