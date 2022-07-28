package Exercise;

import java.util.Scanner;

public class SpecialNumbers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        // vseki cikul e za vsqka otdelna cifra ot 4cifrenoto chislo
        //zatova sa 4 - shte vyrtqt vs chisla ot 1111 do 9999

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                for (int k = 1; k <= 9; k++) {
                    for (int l = 1; l <= 9; l++) {
                        //cifrite sa  i j k l
                        //proverka da vidim dali vsqka cifra ot 4cifrenite chisla
                        // se deli bez ostatyk na chisloto vuvedeno ot konzolata, proverka dali
                        //chisloto e specialno
                        boolean specialNumber = n % i == 0 && n % j == 0
                                && n % k == 0 && n % l == 0;
                        if (specialNumber) {
                            System.out.printf("%d%d%d%d ", i, j, k, l);
                        }


                    }
                }

            }
        }

    }
}
