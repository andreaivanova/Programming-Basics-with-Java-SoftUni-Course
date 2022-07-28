package Lab;

import java.util.Scanner;

public class MaxNumber_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int maxNumber = Integer.MIN_VALUE;
        // double max = Double.MIN_VALUE // nai malkoto polojitelno double chislo
        //double max = Double.NEGATIVE_INFINITY//NAI malkoto otricatelno double chislo
        // double min = Double.POSITIVE_INFINITY//nai golqmoto polojitelno double chislo
        while (!text.equals("Stop")) {
            int num = Integer.parseInt(text);
            if (maxNumber < num) {
                maxNumber = num;
            }


            text = scanner.nextLine();
        }
        System.out.println(maxNumber);

    }
}
