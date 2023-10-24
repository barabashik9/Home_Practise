package day12_tasks;

import java.util.Scanner;

public class MorningOrNightTernary {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your time: \n(0 - 24)");

        int enterTime = input.nextInt();

        String dayTime = (enterTime <= 24 && enterTime >= 12) ? "Night" : (enterTime < 0 && enterTime <= 11) ? "Morning" : "Invalid number";
        System.out.println(dayTime);






    }

}
