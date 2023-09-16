package day05_tasks;

import java.sql.SQLOutput;

public class Employee {

    public static void main(String[] args) {


        String firstName = "Oleksandr";
        String lastName = "Barabash";
        String companyName = "Apple";
        int salary = 150_000;
        byte startDay = 9;
        byte startMonth = 9;
        int startYear = 2023;
        boolean areTheyFullTime = true;
        String jobTitle = "Java SDET";
        String officeAddress = "1 Apple Park Way; Cupertino, CA 95014";


        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Company Name: " + companyName);
        System.out.println("Salary: $ " + salary);
        System.out.println("Start Day: " + startDay);
        System.out.println("Start Month: " + startMonth);
        System.out.println("Start Year: " + startYear);
        System.out.println("Are They Full Time: " + areTheyFullTime);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Office Address: " + officeAddress);



        String fullName = firstName + " " + lastName;
        String fullStartDate = startMonth + "/" + startDay + "/" + startYear;
        String email = firstName + startDay + "@" + "$" + companyName + ".com";
        int salaryAfte3Years = salary + 26_000 + 26_000;


        String fullMessage = "Full Name: " + fullName + "\nFull Start Date: " +
                fullStartDate + "\nEmail: " + email + "\nSalary After 3 Years: " + salaryAfte3Years;

        System.out.println(fullMessage);




    }
}
