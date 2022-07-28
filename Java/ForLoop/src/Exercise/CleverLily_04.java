package Exercise;

import java.util.Scanner;

public class CleverLily_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        double washingMachinePrice = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());
        double savedMoney = 0;
        int toys = 0;
        int brotherTakenMoney = 0;
        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                if (i == 2) {
                    savedMoney = 10;
                } else {
                    savedMoney = savedMoney + 10.00 * i / 2;
                }
                brotherTakenMoney++;

            } else {
                toys++;
            }

        }
        double toysSavedMoney = toys * toyPrice;
        double totalSavedMoney = savedMoney + toysSavedMoney - brotherTakenMoney;
        if (totalSavedMoney >= washingMachinePrice) {
            System.out.printf("Yes! %.2f", totalSavedMoney - washingMachinePrice);
        } else {
            System.out.printf("No! %.2f", washingMachinePrice - totalSavedMoney);
        }


    }
}
