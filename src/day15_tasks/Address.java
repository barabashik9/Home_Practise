package day15_tasks;

import java.util.Scanner;

public class Address {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your Address: ");

        String address = input.nextLine();

        if (address.isEmpty()){
            System.out.println("No address found");
        }else {
            System.out.println(address.toUpperCase());
        }
    }
}
