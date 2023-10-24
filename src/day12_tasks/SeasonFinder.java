package day12_tasks;

import java.util.Scanner;

public class SeasonFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of month: ");
        int number = input.nextInt();
        switch (number) {
            case 12:
            case 2:
            case 1:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Fall");
                break;
            default:
                System.out.println("invalid number");
        }

        System.out.println("************************************");

        System.out.println("Enter the number of month: ");
        int num1 = input.nextInt();
        if (num1 == 12 || num1 == 1 || num1 == 2) {
            System.out.println("Winter");
        } else if (num1 == 3 || num1 == 4 || num1 == 5) {
            System.out.println("Spring");

        } else if (num1 == 6 || num1 == 7 || num1 == 8) {
            System.out.println("Summer");

        } else if (num1 == 9 || num1 == 10 || num1 == 11) {
            System.out.println("Fall");
        } else {
            System.out.println("invalid number");
        }


    }



}
