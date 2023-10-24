package day14_tasks;

import java.util.Scanner;

public class Filter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your message");
        String message = input.nextLine();

        if (message.contains("java is bad") || message.contains("quit") || message.contains("have fun") || message.contains("crying")){
            System.out.println(message.trim() + " message failed to send!");
        } else if (!message.contains("java is bad") || !message.contains("quit") || !message.contains("have fun") || !message.contains("crying")) {
            System.out.println(message.trim() + " message sent!");
        }
    }
}
