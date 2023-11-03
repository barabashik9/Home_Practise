package day24_tasks;

public class MethodPractice9 {
    public static void EvenOdd (int[] array){
        int evenCount = 0;
        int oddCount = 0;

        for (int element : array){
            if (element % 2 == 0){
                evenCount ++;
            }else{
                oddCount++;
            }
        }
        int[] counts = new int[] {evenCount, oddCount};
        System.out.println("Even count: " + counts[0]);
        System.out.println("Odd number: " + counts[1]);
    }


    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        EvenOdd(array);
    }
}
