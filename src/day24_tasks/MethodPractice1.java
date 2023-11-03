package day24_tasks;

public class MethodPractice1 {
    public static void oddNumPrint (){
        int num = 100;
        for (int i = 1; i <= num ; i++) {
            if (i % 2 == 0){
                System.out.print(i + " ");
            }
        }
    }

    public static void evenNumPrint (){
        int num = 100;
        for (int i = 1; i < num ; i++) {
            if ( i % 2 != 0){
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        oddNumPrint();
        System.out.println();
        evenNumPrint();
        System.out.println();
    }
}
