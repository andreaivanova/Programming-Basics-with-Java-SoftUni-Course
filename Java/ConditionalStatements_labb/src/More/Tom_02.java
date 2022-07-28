package More;

import java.util.Scanner;

public class Tom_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int daysOff = Integer.parseInt(scanner.nextLine());

        int normPlayMin = 30000;
        int daysWork = 365 - daysOff;
        int realPlayMin = daysWork * 63 + daysOff * 127;
        int difference = Math.abs(normPlayMin - realPlayMin);
        int differenceHours = difference / 60;
        int differenceMin = difference % 60;
        if (normPlayMin > realPlayMin) {
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %d minutes less for play", differenceHours, differenceMin);
        } else {
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %d minutes more for play", differenceHours, differenceMin);
        }







    }
}
