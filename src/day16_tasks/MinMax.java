package day16_tasks;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int highest = -2147483648;
        int lowest = 2147483647;
        int counter = 1;

        while (counter <= 5){
            System.out.println("Enter your number: ");
            int num = input.nextInt();

            if (num > highest){
                highest = num;
            }
            if (num < lowest){
                lowest = num;
            }
            counter++;
        }
        System.out.println("Max: " + highest);
        System.out.println("Min: " + lowest);
        System.out.println("Max: " + highest + " & Min: " + lowest);
    }
}
