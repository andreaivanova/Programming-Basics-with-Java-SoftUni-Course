package More;

import java.util.Scanner;

public class RentACar_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String classCar = "";
        String typeCar = "";
        double priceCar = 0;

        if (budget <= 100) {
            classCar = "Economy class";
            switch (season) {
                case "Summer":
                    typeCar = "Cabrio";
                    priceCar = budget * 0.35;
                    break;
                case "Winter":
                    typeCar = "Jeep";
                    priceCar = budget * 0.65;
                    break;

            }

        } else if (budget > 100 && budget <= 500) {
            classCar = "Compact class";
            switch (season) {
                case "Summer":
                    typeCar = "Cabrio";
                    priceCar = budget * 0.45;
                    break;
                case "Winter":
                    typeCar = "Jeep";
                    priceCar = budget * 0.80;
                    break;


            }
        } else {
            classCar = "Luxury class";
            switch (season) {
                case "Summer":
                case "Winter":
                    typeCar = "Jeep";
                    priceCar = budget * 0.90;
                    break;
            }


        }
        System.out.printf("%s%n", classCar);
        System.out.printf("%s - %.2f", typeCar, priceCar);


    }
}