package day08_tasks;

import java.sql.SQLOutput;
import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an int number: ");
        int num = input.nextInt();


        boolean isEven = num%2 == 0;
        boolean isOdd = num%2 != 0;

        System.out.println(num + " Is Even: " + isEven);
        System.out.println(num + " Is Odd: " + isOdd);





    }

}
