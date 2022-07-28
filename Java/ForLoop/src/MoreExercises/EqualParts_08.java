package MoreExercises;

import java.util.Scanner;

public class EqualParts_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int lastSum = 0;
        boolean isEqual = true;
        int diff = 0;
        int maxDiff = 0;
        for (int i = 0; i < n; i++) {
            int num1 = Integer.parseInt(scanner.nextLine());
            int num2 = Integer.parseInt(scanner.nextLine());
            sum = num1 + num2;

            if (i > 0) {
                if (sum != lastSum) {
                    diff = Math.abs(lastSum - sum);
                    isEqual = false;
                }


            }
            if (maxDiff < diff) {
                maxDiff = diff;
            }
            lastSum = sum;
        }
        if (isEqual) {
            System.out.printf("Yes, value=%d", lastSum);
        } else {
            System.out.printf("No, maxdiff=%d", maxDiff);
        }


    }
}
