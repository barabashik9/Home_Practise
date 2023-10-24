package day15_tasks;

public class SMSPart {
    public static void main(String[] args) {
                String message = "Sender: <James Bond>. From Number: [202-123-3456]. + Message: {“I love programming and problem solving}";

                String sender = message.substring(message.indexOf("<") + 1, message.lastIndexOf(">"));
                String number = message.substring(message.indexOf("[") + 1, message.lastIndexOf("]"));
                String actualMessage = message.substring(message.indexOf("{") + 1, message.lastIndexOf("}"));


        System.out.println(message);
        System.out.println("-------------------------------");
        System.out.println("Sender: " + sender);
        System.out.println("Number: " + number);
        System.out.println("Message: " + actualMessage);
    }
}
