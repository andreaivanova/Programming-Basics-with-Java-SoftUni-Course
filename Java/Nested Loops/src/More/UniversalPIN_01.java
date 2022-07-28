package More;

import java.util.Scanner;

public class UniversalPIN_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());
        boolean isItPrime = true;

        for (int i = 1; i <= first; i++) {
            for (int j = 1; j <= second; j++) {
                for (int k = 1; k <= third; k++) {
                    for (int l = 2; l <= j; l++) {
                        if (j % l == 0 && j == 1){
                            isItPrime = false;
                            break;
                        }
                    }
                    boolean isValid = (i % 2 == 0) && (k % 2 == 0) && isItPrime;

                    if (isValid) {
                        System.out.printf("%d %d %d%n", i, j, k);
                    }

                }
            }
        }
    }
}
