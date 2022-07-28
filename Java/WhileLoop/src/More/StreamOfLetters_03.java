package More;

import java.util.Scanner;

public class StreamOfLetters_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();
        boolean isFoundC = false;
        boolean isFoundO = false;
        boolean isFoundN = false;
        String word = "";

        while (!input.equals("End")) {
            char letter = input.charAt(0); //vzimame element ot string,
            // ideksaciqta na string zapochva ot 0, a nie imame samo edna bukva;

            //ot ascii tablicata
            if (letter < 'A' || (letter > 'Z' && letter < 'a') || letter > 'z') {
                input = scanner.nextLine();
                continue;
            }
            if ("c".equals(input) && !isFoundC) {
                isFoundC = true;
            } else if ("o".equals(input) && !isFoundO) {
                isFoundO = true;
            } else if ("n".equals(input) && !isFoundN){
                isFoundN = true;
            } else {
                word += input;
            }

            if (isFoundC && isFoundN && isFoundO){
                isFoundC = false;
                isFoundO = false;
                isFoundN = false;
                System.out.print(word + " ");
                word = "";
            }


            input = scanner.nextLine();
        }


    }
}
