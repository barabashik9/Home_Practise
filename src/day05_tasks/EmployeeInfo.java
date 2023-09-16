package day05_tasks;

public class EmployeeInfo {
    public static void main(String[] args) {

        String firstName = "James", lastName = "Bond", gender = "M", companyName = "MI6", jobTitle = "Special Agent";
        char suite = 'D';
        byte age = 40, numberOfPto = 15;
        int salary = 1_000_000;
        boolean areTheFullTime = true, areTheyMarried = false;

        System.out.println("Imployment information for " + firstName + " " + lastName);
        System.out.println("Gender: " + gender + "\n" +jobTitle + " at " + companyName);
        System.out.println("Currently " + age + "years old \n" + companyName +"is located in suite " + suite);
        System.out.println("This year salary comes to $ " + salary);
        System.out.println("Other details: \n" + "PTO: " + numberOfPto);
        System.out.println("Full time? " + areTheFullTime);
        System.out.println("Married? " + areTheyMarried);

    }
}
