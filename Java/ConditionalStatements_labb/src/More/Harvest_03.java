package More;

import java.util.Scanner;

public class Harvest_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int squareM = Integer.parseInt(scanner.nextLine());
        double grapeOneSquareM = Double.parseDouble(scanner.nextLine());
        int neededWine = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());

        double totalGrape = squareM * grapeOneSquareM;
        double producedWine = (totalGrape * 0.40 / 2.5);
        double leftOrNotEnoughWine = 0;
        double litersPerWorker = 0;

        if (producedWine >= neededWine) {
            leftOrNotEnoughWine = Math.ceil(producedWine - neededWine);
            litersPerWorker = Math.ceil(leftOrNotEnoughWine / workers);

            System.out.printf("Good harvest this year! Total wine: %.0f liters.", Math.floor(producedWine));
            System.out.printf("%n%.0f liters left -> %.0f liters per person.", leftOrNotEnoughWine, litersPerWorker);
        } else {
            leftOrNotEnoughWine = Math.floor(neededWine - producedWine);
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", leftOrNotEnoughWine);

           // “It will be a tough winter! More {недостигащо вино} liters wine needed.”
            //
            //

        }



    }
}
