package More;

import java.util.Scanner;

public class BikeRace_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int juniors = Integer.parseInt(scanner.nextLine());
        int seniors = Integer.parseInt(scanner.nextLine());
        String typeRoad = scanner.nextLine();
        double taxJuniors = 0;
        double taxSeniors = 0;
        double totalSum = 0;


       switch (typeRoad){
           case "trail":
               taxJuniors = 5.50 * juniors;
               taxSeniors = 7 * seniors;
               totalSum = taxJuniors + taxSeniors;
               break;

           case "cross-country":
               taxJuniors = 8 * juniors;
               taxSeniors = 9.50 * seniors;
               totalSum = taxJuniors + taxSeniors;
               break;

           case "downhill":
               taxJuniors = 12.25 * juniors;
               taxSeniors = 13.75 * seniors;
               totalSum = taxJuniors + taxSeniors;
               break;

           case "road":
               taxJuniors = 20 * juniors;
               taxSeniors = 21.50 * seniors;
               totalSum = taxJuniors + taxSeniors;
               break;






       }
       int totalBikers = seniors + juniors;

        if (typeRoad.equals("cross-country") && totalBikers >= 50){
            totalSum = totalSum - totalSum * 0.25;
        }

        totalSum = totalSum - totalSum * 0.05;

        System.out.printf("%.2f", totalSum);



    }
}
