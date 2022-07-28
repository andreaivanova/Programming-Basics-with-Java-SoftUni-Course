package More;

import java.util.Scanner;

public class Holiday_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String accommodation = "";
        String destination = "";
        double priceHoliday = 0;


        if (budget <= 1000) {accommodation = "Camp";
        switch (season){
            case "Summer":
                destination = "Alaska";
                priceHoliday = budget * 0.65;
                break;
            case "Winter":
                destination = "Morocco";
                priceHoliday = budget * 0.45;
                break;
        }
        } else if (budget > 1000 && budget <= 3000){
            accommodation = "Hut";

            switch (season){
                case "Summer":
                    destination = "Alaska";
                    priceHoliday = budget * 0.80;
                    break;
                case "Winter":
                    destination = "Morocco";
                    priceHoliday = budget * 0.60;
                    break;
            }

        }


        else  {
            accommodation = "Hotel";

            switch (season){
                case "Summer":
                    destination = "Alaska";
                    priceHoliday = budget * 0.90;
                    break;
                case "Winter":
                    destination = "Morocco";
                    priceHoliday = budget * 0.90;
                    break;
            }

        }

        System.out.printf("%s - %s - %.2f", destination, accommodation, priceHoliday);


    }
}
