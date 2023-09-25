package day09_tasks;

import java.util.Scanner;

public class PrintGreatest {
    public static void main(String[] args) {
        System.out.println("The greatest number from 4,8,1 is: ");

        int number1 = 4;
        int number2 = 8;
        int number3 = 1;

        if (number1 > number2 && number1 > number3)
            System.out.println(number1);


        if (number2 > number1 && number2 > number3)
            System.out.println(number2);


        if (number3 > number1 && number3 > number2)
            System.out.println(number3);

    }
}
