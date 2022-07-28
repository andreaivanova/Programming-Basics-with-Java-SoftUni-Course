package Exercise;

import java.util.Scanner;

public class EqualSumsEvenOddPosition_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());

        for (int i = n1; i <= n2; i++) {
            int currentNumber = i;
            int evenSum = 0;
            int oddSum = 0;
            for (int j = 6; j > 0; j--) {
                int digit = currentNumber % 10; //vzimame poslednata cifra na chislito
                if (j % 2 == 0) {
                    evenSum += digit;
                } else {
                    oddSum += digit;
                }
                currentNumber = currentNumber / 10; //premahvame poslednata cifra
            }
            if (evenSum == oddSum) {
                System.out.print(i + " ");
            }
        }


    }
}
