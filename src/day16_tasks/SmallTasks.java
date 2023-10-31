package day16_tasks;

public class SmallTasks {
    public static void main(String[] args) {
        for(char letter = 'a'; letter <= 'z'; letter++){
            System.out.print(letter + " ");
        }
        System.out.println();

        for (char letter = 'A'; letter <= 'Z'; letter++){
            System.out.print(letter + " ");
        }
        System.out.println();


        for (char letter = 'Z'; letter >= 'A'; letter--){
            System.out.print(letter + " ");
        }
        System.out.println();


        for (char letter = 'z'; letter >= 'a'; letter--){
            System.out.print(letter + " ");
        }
        System.out.println();


        for (int number = 1; number <= 500 ; number++) {
            System.out.print(number + " ");
        }
        System.out.println();
        for (int number = 1; number <= 50 ; number++) {
            if(number % 3 == 0 && number % 5 != 0){
                System.out.print("Fizz ");
            }else if (number % 5 == 0 && number %3 != 0){
                System.out.print("Buzz ");
            }else if (number % 5 ==0 && number % 3 == 0){
                System.out.print("FizzBuzz ");
            }else {
                System.out.print("" + number + "");
            }
        }
    }
}
