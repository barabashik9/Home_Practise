package day08_tasks;

import java.util.Scanner;

public class Divisible {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter the number: ");
        int num = input.nextInt();


        boolean isDivisible2 = num % 2 == 0;
        boolean isDivisible3 = num % 3 == 0;
        boolean isDivisible5 = num % 5 == 0;


        System.out.println(num + " is divisible by 2: " + isDivisible2);
        System.out.println(num + " is divisible by 3: " + isDivisible3);
        System.out.println(num + " is divisible by 5: " + isDivisible5);







    }
}
