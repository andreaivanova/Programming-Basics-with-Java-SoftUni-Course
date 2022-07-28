package Exercise;

import java.util.Scanner;

public class Ski_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String grade = scanner.nextLine();

        double priceNight = 0;


        switch (type) {
            case "room for one person":
                priceNight = 18;
                break;
            case "apartment":
                priceNight = 25;
                break;
            case "president apartment":
                priceNight = 35;
                break;

        }

        double finalPrice = priceNight * (days - 1);


        if (type.equals("apartment")) {
            if (days < 10) {
                finalPrice = finalPrice - finalPrice * 0.30;
            } else if (days >= 10 && days <= 15) {
               finalPrice = finalPrice - finalPrice * 0.35;
            } else {
                finalPrice = finalPrice - finalPrice * 0.50;
            }

        } else if (type.equals("president apartment")) {
            if (days < 10) {
                finalPrice = finalPrice - finalPrice * 0.10;
            } else if (days >= 10 && days <= 15) {
                finalPrice = finalPrice - finalPrice * 0.15;
            } else {
                finalPrice = finalPrice - finalPrice * 0.20;
            }

        }



        if (grade.equals("positive")){
            finalPrice = finalPrice + finalPrice * 0.25;
            System.out.printf("%.2f", finalPrice);

        } else if (grade.equals("negative")){
            finalPrice = finalPrice - finalPrice * 0.10;
            System.out.printf("%.2f", finalPrice);
        }


    }
}
