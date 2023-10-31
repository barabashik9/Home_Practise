package day19_tasks;

import java.sql.SQLOutput;

public class DuplicateCharacters {
    public static void main(String[] args) {

        String str = "AAABBBCCCCEEEF";
        String newstr = "";

        for (int i = 0; i < str.length(); i++) {
            if (newstr.contains("" + str.charAt(i))) {
                continue;
            }
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if (count > 1){
                System.out.print(str.charAt(i));
                newstr += str.charAt(i);
            }
        }
    }
}
