package day15_tasks;

import java.util.Scanner;

public class CreatingAnEmail {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two words that are at least 6 character long: ");
        String wordOne = input.next();
        String wordTwo = input.next();
        wordOne = wordOne.toLowerCase();
        wordTwo = wordTwo.toLowerCase();


        if (wordOne.length() < 6 || wordTwo.length() <6){
            System.out.println("Invalid data");
        }else{
            System.out.println(wordOne.substring(0,4) + wordTwo.substring(wordTwo.length() -3) + "@loopcamp.io");
        }
    }
}
