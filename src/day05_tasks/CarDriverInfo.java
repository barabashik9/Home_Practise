package day05_tasks;

public class CarDriverInfo {
    public static void main(String[] args) {
        String carModel = "Lexus RX 350", driverName = "Oleksandr Barabash", licenseNumber = "DMV_0913";
        short speed = 220;
        boolean isAutomatic = true;
        char licenceClass = 'C';


        System.out.println("My car is: " + carModel);
        System.out.println("Driver name: " + driverName);
        System.out.println("Licence Number: " + licenseNumber);
        System.out.println("Max Speed: " + speed + "mph");
        System.out.println("Is it Automatic transmission?: " + isAutomatic);
        System.out.println("What is the license class:" + licenceClass);
    }
}