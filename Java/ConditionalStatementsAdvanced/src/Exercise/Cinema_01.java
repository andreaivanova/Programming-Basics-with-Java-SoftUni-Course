package Exercise;

import java.util.Scanner;

public class Cinema_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String ticket = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        int all = rows * columns;
        double income = 0;

        switch (ticket) {
            case "Premiere":
                income = all * 12.00;
                break;

            case "Normal":
                income = all * 7.50;
                break;

            case "Discount":
                income = all * 5.00;
                break;


        }
        System.out.printf("%.2f leva", income);
    }
}
