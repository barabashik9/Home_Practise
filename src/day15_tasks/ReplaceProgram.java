package day15_tasks;

import java.util.Scanner;

public class ReplaceProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your message: ");
        String message = input.nextLine();
        System.out.println("Enter your number: ");
        int number = input.nextInt();
        String messageChanged = "";


        if (number == 1){
            messageChanged = message.replace("a", "e");
        } else if (number == 2) {
            messageChanged = message.replace("s", "r");
        } else if (number == 3) {
            messageChanged = message.replace("o", "z");
        }
        System.out.println(messageChanged);
    }
}
