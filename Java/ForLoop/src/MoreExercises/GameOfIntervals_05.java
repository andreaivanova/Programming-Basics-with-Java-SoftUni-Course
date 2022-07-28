package MoreExercises;

import java.util.Scanner;

public class GameOfIntervals_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int timesGame = Integer.parseInt(scanner.nextLine());
        double result = 0;
        int percent09 = 0;
        int percent1019 = 0;
        int percent2029 = 0;
        int percent3039 = 0;
        int percent4050 = 0;
        int percentInvalid = 0;


        for (int i = 1; i <= timesGame; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            if (number < 0) {
                result = result / 2;
                percentInvalid++;
            } else if (number <= 9) {
                result += number * 0.2;
                percent09++;

            } else if (number <= 19) {
                result += number * 0.3;
                percent1019++;
            } else if (number <= 29) {
                result += number * 0.4;
                percent2029++;
            } else if (number <= 39) {
                result += 50;
                percent3039++;
            } else if (number <= 50) {
                result += 100;
                percent4050++;
            } else {
                result = result / 2;
                percentInvalid++;
            }


        }
        double fpercent09 = percent09 * 1.00 / timesGame * 100;
        double fpercent1019 = percent1019 * 1.00 / timesGame * 100;
        double fpercent2029 = percent2029 * 1.00 / timesGame * 100;
        double fpercent3039 = percent3039 * 1.00 / timesGame * 100;
        double fpercent4050 = percent4050 * 1.00 / timesGame * 100;
        double fpercentInvalid = percentInvalid * 1.00 / timesGame * 100;
        System.out.printf("%.2f%n", result);
        System.out.printf("From 0 to 9: %.2f%%%n", fpercent09);
        System.out.printf("From 10 to 19: %.2f%%%n", fpercent1019);
        System.out.printf("From 20 to 29: %.2f%%%n", fpercent2029);
        System.out.printf("From 30 to 39: %.2f%%%n", fpercent3039);
        System.out.printf("From 40 to 50: %.2f%%%n", fpercent4050);
        System.out.printf("Invalid numbers: %.2f%%", fpercentInvalid);

    }
}
