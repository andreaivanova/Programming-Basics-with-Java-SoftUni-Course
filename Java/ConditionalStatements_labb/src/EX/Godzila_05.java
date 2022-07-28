package EX;

import java.util.Scanner;

public class Godzila_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int people = Integer.parseInt(scanner.nextLine());
        double clothes = Double.parseDouble(scanner.nextLine());

        //   •	Декорът за филма е на стойност 10% от бюджета.
//•	При повече от 150 статиста,  има отстъпка за облеклото на стойност 10%.

        double sumDecor = budget * 0.10;
        double sumClothes = people * clothes;
        double sumClothesD = 0;

        if (people > 150) {
            sumClothesD = sumClothes - (sumClothes * 0.10);
        } else {
            sumClothesD = sumClothes;
        }

        double totalSum = sumDecor + sumClothesD;
        double leftMoney = 0;

        if (totalSum <= budget){
            leftMoney = budget - totalSum;
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", leftMoney);
        } else {leftMoney = totalSum - budget;
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", leftMoney);
        }






    }
}
