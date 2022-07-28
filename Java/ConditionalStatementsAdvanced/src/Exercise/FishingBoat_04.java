package Exercise;

import java.util.Scanner;

public class FishingBoat_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishers = Integer.parseInt(scanner.nextLine());
        double rentBoat = 0;

        switch (season) {
            case "Spring":
                rentBoat = 3000.00;
                break;

            case "Summer":
            case "Autumn":
                rentBoat = 4200;
                break;

            case "Winter":
                rentBoat = 2600;
                break;


        }
        if (fishers <= 6) {
            rentBoat = rentBoat - rentBoat * 0.10;
        } else if  (fishers <= 11) {
            rentBoat = rentBoat - rentBoat * 0.15;
        } else {
            rentBoat = rentBoat - rentBoat * 0.25;
        }

        if (!season.equals("Autumn") && fishers % 2 == 0) {
            rentBoat = rentBoat - rentBoat * 0.05;

        }




        if (rentBoat <= budget) {
            System.out.printf("Yes! You have %.2f leva left.", budget - rentBoat);


        } else {System.out.printf("Not enough money! You need %.2f leva.", rentBoat - budget);

        }


    }
}
