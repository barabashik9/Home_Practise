package day15_tasks;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LongestWithA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter different three words: ");
        String wordOne = input.next();
        String wordTwo = input.next();
        String wordThree = input.next();

        int wordOneLenght = wordOne.length();
        int wordTwoLenght = wordTwo.length();
        int wordThreeLenght = wordThree.length();


        String message = "";


        if (wordOne.contains("a") && wordOneLenght >= wordTwoLenght && wordOneLenght >= wordThreeLenght) {
            message = "The longest with a: " + wordOne;
        } else if (wordTwo.contains("a") && wordTwoLenght >= wordOneLenght && wordTwoLenght >= wordThreeLenght) {
            message = "The longest with a: " + wordTwo;
        }else if (wordThree.contains("a") && wordThreeLenght >= wordOneLenght && wordThreeLenght >= wordTwoLenght){
            message = "The longest with a: " + wordThree;
        }
        System.out.println(message);

    }
}
