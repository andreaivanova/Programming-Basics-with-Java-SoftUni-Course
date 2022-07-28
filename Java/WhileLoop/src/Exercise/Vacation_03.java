package Exercise;

import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double neededMoney = Double.parseDouble(scanner.nextLine());
        double availableMoney = Double.parseDouble(scanner.nextLine());
        int days = 0;
        int spendDays = 0;


        while (availableMoney < neededMoney) {
            if (spendDays == 5) {
                break;
            }
            String action = scanner.nextLine();
            double amount = Double.parseDouble(scanner.nextLine());


            days++;
            if (action.equals("save")) {
                availableMoney += amount;
                spendDays = 0; // zanulqvane zashtoto ni trqbvat 5 posledovatelni
                // dni, v koito da harchim, a ne obshto

            } else if (action.equals("spend")) {
                spendDays++;
                availableMoney -= amount;
                if (availableMoney < 0) {
                    availableMoney = 0;
                }

            }

        }
        if (spendDays == 5) {
            System.out.println("You can't save the money.");
            System.out.println(days);
        } else {
            System.out.printf("You saved the money for %d days.", days);
        }
    }
}
