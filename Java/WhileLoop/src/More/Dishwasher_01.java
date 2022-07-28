package More;

import java.util.Scanner;

public class Dishwasher_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int bottles = Integer.parseInt(scanner.nextLine());
        int dishes = 0;
        int pots = 0;
        int counterDays = 0;
        int quantityCleaner = bottles * 750;


        String input = scanner.nextLine();

        while (!input.equals("End")){
            int itemsToWash = Integer.parseInt(input);
            counterDays++;

            if (counterDays % 3 == 0){
                pots += itemsToWash;
                quantityCleaner -= itemsToWash * 15;

            } else {
                dishes += itemsToWash;
                quantityCleaner -= itemsToWash * 5;

            }
            if (quantityCleaner < 0){
                System.out.printf("Not enough detergent, %d ml. more necessary!", Math.abs(quantityCleaner));
                break;
            }


            input = scanner.nextLine(); // update
        }
        if (input.equals("End")){
            System.out.println("Detergent was enough!");
            System.out.printf("%d dishes and %d pots were washed.%n", dishes, pots);
            System.out.printf("Leftover detergent %d ml.",quantityCleaner);


        }

        //if ( x % 3 == 0) za vsqko treto zarejdane

    }
}
