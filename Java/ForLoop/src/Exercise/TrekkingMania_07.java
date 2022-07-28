package Exercise;

import java.util.Scanner;

public class TrekkingMania_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countGroups = Integer.parseInt(scanner.nextLine());
        int musala = 0;
        int montblanc = 0;
        int kilimandjaro = 0;
        int k2 = 0;
        int everest = 0;
        double total = 0;


        for (int i = 1; i <= countGroups; i++) {
            int people = Integer.parseInt(scanner.nextLine());
            total = total + people;
            if (people <= 5) {
                musala = people + musala;
            } else if (people <= 12) {
                montblanc = people + montblanc;
            } else if (people <= 25) {
                kilimandjaro = people + kilimandjaro;
            } else if (people <= 40) {
                k2 = people + k2;
            } else {
                everest = people + everest;
            }

        }

        double percentMusala = musala / total * 100;
        double percentMontblanc = montblanc / total * 100;
        double percentCilimandjaro = kilimandjaro / total * 100;
        double percentK2 = k2 / total * 100;
        double percentEverest = everest / total * 100;

        System.out.printf("%.2f%%%n", percentMusala);
        System.out.printf("%.2f%%%n", percentMontblanc);
        System.out.printf("%.2f%%%n", percentCilimandjaro);
        System.out.printf("%.2f%%%n", percentK2);
        System.out.printf("%.2f%%%n", percentEverest);

    }
}
