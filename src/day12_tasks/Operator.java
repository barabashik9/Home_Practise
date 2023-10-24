package day12_tasks;

public class Operator {
    public static void main(String[] args) {
        int a = 3;
        int b = 2;
        long c = (a-- + b) * 2 / 3 % 2;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        if (a > b && a > c) {
            System.out.println(a + " is the biggest");
        }else if (b > a && b > c) {
            System.out.println(b + " is the biggest");
        }else if (c > a && c > b) {
            System.out.println(c + "is the biggest");
        }else if (a == b && a == c) {
            System.out.println("All numbers is equal");
        }else if (a == b){
            System.out.println(a + " is equals " + b);
        }else if (a == c){
            System.out.println(a + " is equals " + c);
        }else if (b == c){
            System.out.println(b + " is equals " + c);
        }

        System.out.println("------------------------------------");


        int numOne = 10;
        int numTwo = numOne++ * 3 + ++numOne + numOne++ % 2;


        System.out.println(numOne);
        System.out.println(numTwo);

        if (numOne > numTwo){
            System.out.println(numOne + " is bigger than " + numTwo);
        }else if (numTwo > numOne){
            System.out.println(numTwo + " is bigger than " + numOne);
        }else
            System.out.println(numOne + " = " + numTwo);
    }
}
