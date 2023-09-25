package day09_tasks;

import java.util.Scanner;

public class OceanTank {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your current oxygen level of in your tank? ");
        int oxygenLevel = input.nextInt();

        if (oxygenLevel >= 90) {
            System.out.println("Your tank is full");
        }else if (oxygenLevel >= 80) {
            System.out.println("Still Okay");
        }else if (oxygenLevel >= 70) {
            System.out.println("Don't go too far");
        }else if (oxygenLevel >= 60) {
            System.out.println("Start to head back");
        }else if (oxygenLevel >= 50) {
            System.out.println("Be careful now you are at 50%");
        }
    }
}
