package day24_tasks;

import java.util.Scanner;

public class MethodPractice7 {




        public static void main(String[] args) {ArrayMethod();}





        public static void ArrayMethod () {
            int sum = 0;
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the size of Array: ");
            int size = input.nextInt();
            int[] array = new int[size];

            System.out.println("Enter the element of the array: ");
            for (int i = 0; i < size; i++) {
                System.out.println("Element " + (i + 1) + ": ");
                array[i] = input.nextInt();
                sum += array[i];

            }
            System.out.println("The sum of array is: " + sum);
        }

    }