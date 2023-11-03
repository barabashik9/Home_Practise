package day24_tasks;

import java.util.Scanner;

public class MethodPractice3 {

    public static String number(int num){
        String result = num > 0 ? "positive" : num == 0 ? "zero" : "negative";
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int age = input.nextInt();
        System.out.println(number(age));
    }
}
