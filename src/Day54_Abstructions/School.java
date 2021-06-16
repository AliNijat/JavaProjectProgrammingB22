package Day54_Abstructions;

public class School {
    public static void main(String[] args) {

       // Student student = new Student();

        OnlineStudent onlineStudent = new OnlineStudent();
        onlineStudent.attendClass();

        CampusStudent campusStudent = new CampusStudent();
        campusStudent.attendClass();

    }
}
