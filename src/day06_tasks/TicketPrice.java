package day06_tasks;

public class TicketPrice {

    public static void main(String[] args) {

        String city1 = "Chicago";
        String city2 = "Virginia";
        double baseTicketprice = 110.50;
        double milesBetweencities = 739.8;
        double ticketPrice = baseTicketprice + (milesBetweencities / 10);

        System.out.println("The ticket price from " + city1 + " to " + city2 + " is " + ticketPrice);



    }

}
