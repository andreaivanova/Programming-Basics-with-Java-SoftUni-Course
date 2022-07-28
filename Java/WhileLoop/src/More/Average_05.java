package More;

import java.util.Scanner;

public class Average_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int countAmountOfNumbers = 0;
        int sumNumbers = 0;

        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            sumNumbers += number;
            countAmountOfNumbers++;

        }
        System.out.printf("%.2f", sumNumbers * 1.00 / countAmountOfNumbers);
    }
}
