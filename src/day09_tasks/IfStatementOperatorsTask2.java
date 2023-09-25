package day09_tasks;

import java.util.Scanner;

public class IfStatementOperatorsTask2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is your salary?: $");
        int salary = input.nextInt();

        System.out.println("Are you a full time employee? (true/false) : ");
        boolean fullTime = input.hasNextBoolean();


        if (fullTime) {
            int finalSalary = salary + 20000;
            System.out.println("This is your final salary: $" + finalSalary);
        }


        if (!fullTime) {
            int finalsalary = salary - 5000;
        }
    }
}
