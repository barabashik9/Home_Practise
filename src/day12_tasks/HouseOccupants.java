package day12_tasks;

import java.util.Scanner;

public class HouseOccupants {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the type of house : \n(started with capital letter)");
        String typeOfHouse = input.nextLine();

        int treeHouse = 1;
        int mobileHome = 2;
        int apartment = 4;
        int townHouse = 6;
        int villa = 8;
        int mansion = 10;

        String result = "";
        switch (typeOfHouse) {
            case "Tree house":
                result = "There are " + treeHouse + " person in the Tree house!";
                break;
            case "Mobile home":
                result = "There are " + mobileHome + " people in the Mobile home!";
                break;
            case "Apartment":
                result = "There are " + apartment + " people in the Apartment!";
                break;
            case "Town house":
                result = "There are " + townHouse + " people in the Town house!";
                break;
            case "Villa":
                result = "There are " + villa + " people in the Villa!";
                break;
            case "Mansion":
                result = "There are " + mansion + " people in the Mansion!";

            default:
                result = "Invalid type!";

        }

        System.out.println(result);

    }
}
