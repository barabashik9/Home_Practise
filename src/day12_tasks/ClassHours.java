package day12_tasks;

import java.util.Scanner;

public class ClassHours {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter day of week, please: \n(Full day) ");
        String day = input.nextLine();
        String classes = "";

        switch (day) {
            case "Monday": case "monday":
                classes = "Mentor hours";
                break;
            case "Tuesday": case "tuesday":
            case "Friday": case "friday":
                classes = "No classes";
                break;
            case "Wednesday": case "wednesday":
            case "Thursday": case "thursday":
            case "Saturday": case "saturday":
                classes = "Java classes";
                break;
            case "Sunday": case "sunday":
                classes = "Soft skills";
                break;
            default:
                classes = "Invalid day";
                break;
        }
        System.out.println(classes);

    }
}
