package day11_tasks;

import java.util.Scanner;

public class RealEstate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your budget(max)? : ");
        int budget = input.nextInt();

        if (budget >= 80000 && budget <= 100000) {
            System.out.println("According your budget, you can consider this neighborhood: \nname - Hills\n" +
                    "average price - 80,000 - 100,000\n" + "rating - 4.0\n" + "gated - no\n" + "allow pets - yes" );

        } else if (budget >= 55000 && budget <= 75000 ) {
            System.out.println("According your budget, you can consider this neighborhood: \nname - Oaks\n" +
                    "average price - 55,000 - 75,000\n" + "rating - 3.5\n" + "gated - no\n" + "allow pets - yes");
        } else if (budget >= 120000 && budget <= 150000) {
            System.out.println("According your budget, you can consider this neighborhood: \nname - Highland\n" +
                    "average price - 120,000 - 150,000\n" + "rating - 4.8\n" + "gated - yes\n" + "allow pets- no");
        } else if (budget >= 160000 && budget <= 201000) {
            System.out.println("According your budget, you can consider this neighborhood: \nname - Canyon\n" +
                    "average price - 160,000 - 201,000\n" + "rating - 4.8\n" + "gated - yes\n" + "allow pets - yes");
        } else if (budget > 0) {
            System.out.println("That is not a valid budget");
        }else if (budget < 300000) {
            System.out.println("Too much money for this agency");
        }


    }
}
