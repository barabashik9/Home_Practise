package day08_tasks;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PlaceOrder {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the product name: ");
        String name = input.nextLine();

        System.out.println("Enter the price: $");
        double price = input.nextDouble();

        System.out.println("Enter the quantity: ");
        int quantity = input.nextInt();

        System.out.println("Enter your full name: ");

        String fullName = input.next();

        double totalCost =  price * quantity;


        System.out.println(fullName + ", your order for " + quantity + " " + name + " has been placed. Your total is $" + totalCost);





    }

}
