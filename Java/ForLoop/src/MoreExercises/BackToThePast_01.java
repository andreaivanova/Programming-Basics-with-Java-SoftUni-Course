package MoreExercises;

import java.util.Scanner;

public class BackToThePast_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double inheritedMoney = Double.parseDouble(scanner.nextLine());
        int year = Integer.parseInt(scanner.nextLine());
        int ivanAge = 17;
        double lostMoney = 0;

        for (int i = 1800; i <= year; i++) {
            ivanAge++;
            if (i % 2 == 0) {
                lostMoney += 12000;

            } else {
                lostMoney += 12000 + 50 * ivanAge;
            }


        }
        double differenceMoney = Math.abs(inheritedMoney - lostMoney);
        if (inheritedMoney >= lostMoney){
            System.out.printf("Yes! He will live a carefree life " +
                    "and will have %.2f dollars left.", differenceMoney);
        } else {
            System.out.printf("He will need %.2f dollars to survive.", differenceMoney);
        }

    }
}
