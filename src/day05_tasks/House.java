package day05_tasks;

public class House {
    public static void main(String[] args) {
        String houseType = "Penthouse";
        byte numberOfRooms = 4;
        byte numberOfBathrooms = 3;
        byte numberOfKitchens = 1;
        String isThereABasement = "No";
        String isThereAnAttic = "No";
        String isThereAPool = "Yes";
        String isAHouseForSale = "No";
        int costOfHouse = 3_500_000;
        String address = "801 3rd Street Northwest Apt/Unit 928, Washington, DC 20001";
        String isThereParkNearBy = "Yes";
        int schoolRating = 8;

        String fullMessage = "House Type: " + houseType + "\nNumber Of Rooms: " + numberOfRooms + "\nNumber of Bathrooms: " + numberOfBathrooms + "\nNumber of Kitchen: "
                + numberOfKitchens + "\nIs there a basement?: " + isThereABasement + "\nIs there an attic?: " + isThereAnAttic + "\nIs there a pool?: " + isThereAPool +
                "\nIs a house for sale?: " + isAHouseForSale + "\nCost of the house: " + costOfHouse + "\nAdress and zipcode: " + address +
                "\nIs there park near by?: " + isThereParkNearBy + "\nSchool rating: " + schoolRating;


        System.out.println(fullMessage);




    }
}