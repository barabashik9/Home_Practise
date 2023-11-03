package day24_tasks;

public class MethodPractice8 {

    public static void contains (int[] array, int number) {
        boolean found = false;
        for (int element : array){
            if (element == number){
                found = true;
                break;
            }
        }

        if (found){
            System.out.println("This array contains the number " + number);
        }else {
            System.out.println("This array does not contain the number " + number);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        int number = 45;
        contains(array, number);
    }
}
