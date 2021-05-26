package Day23_String_Manipulation;

public class SMSmessage {
    public static void main(String[] args) {

        String message = "Sender: [Nadir] From Number<222-243-2234> " +
                "Message {Helo, lets code some java}";

        String sender = message.substring(message.indexOf("[")+1, message.indexOf("]"));
        String number = message.substring(message.indexOf("<")+1, message.indexOf(">") );
        String text = message.substring(message.indexOf("{")+1, message.indexOf("}"));

        System.out.println("Sender: " + sender +"\n" + "Number: " + number +"\n" + "Message: " + text);

    }
}
