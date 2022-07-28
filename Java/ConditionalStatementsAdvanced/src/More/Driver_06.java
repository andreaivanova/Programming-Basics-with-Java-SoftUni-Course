package More;

import java.util.Scanner;

public class Driver_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String season = scanner.nextLine();
        double kmPerMonth = Double.parseDouble(scanner.nextLine());
        double pricePerMonth = 0;


        if (kmPerMonth <= 5000){
            switch (season){
                case "Spring":
                case "Autumn":
                    pricePerMonth = 0.75;
                    break;
                case "Summer":
                   pricePerMonth = 0.90;
                    break;
                case "Winter":
                pricePerMonth = 1.05;
                break;
            }


        } else if (kmPerMonth > 5000 && kmPerMonth <= 10000){
            switch (season){
                case "Spring":
                case "Autumn":
                    pricePerMonth = 0.95;
                    break;
                case "Summer":
                    pricePerMonth = 1.10;
                    break;
                case "Winter":
                    pricePerMonth = 1.25;
                    break;
            }

        } else if (kmPerMonth > 10000 && kmPerMonth <= 20000){
            switch (season){
                case "Spring":
                case "Autumn":
                case "Summer":
                case "Winter":
                    pricePerMonth = 1.45;
                    break;
            }

        } double salary = pricePerMonth * kmPerMonth;
        salary = salary * 4;
        salary = salary - salary * 0.10;

        System.out.printf("%.2f", salary);














    }
}
