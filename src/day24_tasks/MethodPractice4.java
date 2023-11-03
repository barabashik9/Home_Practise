package day24_tasks;

import java.util.Scanner;

public class MethodPractice4 {

    public static void angles (){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int angle1 = input.nextInt();
        int angle2 = input.nextInt();
        int angle3 = input.nextInt();
        int sum = angle1 + angle2 + angle3;
        if (sum == 180){
            System.out.println("This is a triangle");
        } else if (sum == 360) {
            System.out.println("This is a circle");
        }else{
            System.out.println("This is not angle");
        }
    }

    public static void main(String[] args) {
        angles();
    }

}
