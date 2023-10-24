package day12_tasks;

import java.util.Scanner;

public class PersonalInformation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?: ");
        String name = input.nextLine();
        System.out.println("How many people do you live with?: ");
        int num = input.nextInt();
        String message1,
                message2;

        if (num > 0 && num < 3) {
            message1 = name + " lives with less 3 people.";
        } else if (num >= 3 && num <= 6) {
            message1 = name + " lives with 3-6 people.";
        } else if (num > 6)  {
            message1 = name + " lives more than 6 people.";
        } else {
            message1 = "What does living with " + num + " people means, " + name + "?";
        }
        System.out.println(message1);



        System.out.println("What city do you live in?");
        String city = input.next();
        System.out.println("Do you live in downtown of " + city + "? (True or False)");
        boolean isDowntown = input.nextBoolean();
        if (isDowntown == true) {
            System.out.println("Have you ever though about moving to suburbs? (True or False): ");
            boolean wantSuburbs = input.nextBoolean();
            if (wantSuburbs == true ) {
                message2 = "Do it, it's great!";
            } else {
                message2 = "You should think about it.";
            }
        }else {
            message2 = "Good for you, " + city + " downtown usually has heavy traffic and too noise.";
        }
        System.out.println(message2);


        System.out.println("what is your favorite animal?: ");
        String animal = input.next();
        System.out.println("Wow! " + animal + " is great animal.");
        System.out.println("How many " + animal + "s would you like to have?: ");
        int count = input.nextInt();
        System.out.println("Interesting, you want to have " + count + " " + animal + "'s then.");

    }
}
