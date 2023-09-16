package day06_tasks;

public class GiftCard {

    public static void main(String[] args) {

        int balance = 200;
        int item1Price = 40;
        int item2Price = 100;
        int remainingBalance = balance - item1Price - item2Price;

        System.out.println("The gift card started with a balance $" + balance + " and after buying item1 for $" + item1Price +
                " and item2 for $" + item2Price + ", the remaining balance of the card is $" + remainingBalance);



    }
}
