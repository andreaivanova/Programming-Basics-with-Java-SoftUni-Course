package EX;

import java.util.Scanner;

public class TimePlus15Min_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int min = Integer.parseInt(scanner.nextLine());

        int totalMin = (hours * 60) + min;

        int plus = totalMin + 15;

        int hours2 = plus / 60;
        int min2 = plus % 60;

        if (hours2 == 24) {
            hours2 = 0;
        }

        if (min2 < 10) {
            System.out.printf("%d:0%d", hours2, min2);
        } else {
            System.out.printf("%d:%d", hours2, min2);
        }


    }
}
