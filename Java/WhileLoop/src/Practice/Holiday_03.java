package Practice;

import java.util.Scanner;

public class Holiday_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double neededMoney = Double.parseDouble(scanner.nextLine());
        double availableMoney = Double.parseDouble(scanner.nextLine());
        int counterSpendingDays = 0;
        int counterTotalDays = 0;
        while (availableMoney < neededMoney) {
            if (counterSpendingDays == 5) {
                System.out.printf("You can't save the money.%n%d", counterTotalDays);
                break;
            }
            String action = scanner.nextLine();

            double money = Double.parseDouble(scanner.nextLine());
            counterTotalDays++;
            if (action.equals("spend")) {
                availableMoney -= money;
                counterSpendingDays++;
            } else if (action.equals("save")) {
                availableMoney += money;
                counterSpendingDays = 0;
            }

            if (availableMoney < 0) {
                availableMoney = 0;
            }


        }
        if (availableMoney >= neededMoney) {
            System.out.printf("You saved the money for %d days.", counterTotalDays);

        }
    }
}
