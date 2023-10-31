package day19_tasks;

public class CamelCases {
    public static void main(String[] args) {

        String str = "thisIsHasManyWordToFind";

        int words = 0;

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if (each >= 'A' & each<= 'Z') {
                words ++;
            }

        }
        System.out.println("Numbers of words: " + words);
    }
}
