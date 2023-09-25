package day10_tasks;

import java.util.Scanner;

public class GiftCard {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Select one item of the list what would you like to buy: \n\t1 - Blanket \n\t2 - Charge \n\t3 - Hat  " +
                "\n\t4 - Headphones  \n\t5 - Laptop  \n\t6 - Pants  \n\t7 - Pillow  \n\t8 - Smartphone  \n\t9 - Socks \n\t10 - USB cable" );

        double userchoice = input.nextDouble();
        double paidprice = 0;


        if (userchoice == 1) {
            paidprice = 60;
        }else if (userchoice == 2) {
            paidprice = 25;
        } else if (userchoice == 3) {
            paidprice = 25;
        } else if (userchoice == 4) {
            paidprice = 30;
        } else if (userchoice == 5) {
            paidprice = 200;
        } else if (userchoice == 6 ) {
            paidprice = 50;
        } else if (userchoice == 7 ) {
            paidprice = 40;
        } else if (userchoice == 8 ) {
            paidprice = 1000;
        } else if (userchoice == 9 ) {
            paidprice = 5;
        } else if (userchoice == 10) {
            paidprice = 10;
        }


        double GiftCardBalance = 100;
        double left = GiftCardBalance-paidprice;


        if (left >= 0 && left < 100) {
            System.out.println("Thank you for your purchase!\n" + "Your current balance is:$ " + left);
        } else if (left < 0) {
            System.out.println("Sorry not enough funds on your gift card!");

        } else if (left == 100) {
            System.out.println("Invalid item!");

        }


    }
}
