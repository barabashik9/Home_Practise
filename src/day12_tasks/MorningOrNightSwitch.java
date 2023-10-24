package day12_tasks;

import java.util.Scanner;

public class MorningOrNightSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your time: \n(0 - 24)");
        int time = input.nextInt();

        switch (time) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                System.out.println("Morning");
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
                System.out.println("Night");
                break;
            default:
                System.out.println("Invalid time");

        }
    }

}
