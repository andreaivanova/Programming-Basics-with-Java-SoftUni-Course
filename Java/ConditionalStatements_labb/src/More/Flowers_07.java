package More;

import java.util.Scanner;

public class Flowers_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int magnolii = Integer.parseInt(scanner.nextLine());
        int zyumbyuli = Integer.parseInt(scanner.nextLine());
        int rozi = Integer.parseInt(scanner.nextLine());
        int kaktusi = Integer.parseInt(scanner.nextLine());
        double pricePresent = Double.parseDouble(scanner.nextLine());

        //•	Магнолии – 3.25 лева
        //•	Зюмбюли – 4 лева
        //•	Рози – 3.50 лева
        //•	Кактуси – 8 лева
        //От общата сума, Мария трябва да плати 5% данъци.

        double totalPriceFlowers = magnolii * 3.25 + zyumbyuli * 4
                + rozi * 3.50 + kaktusi * 8;

        double profit = totalPriceFlowers - (totalPriceFlowers * 0.05);
        double difference = Math.abs(pricePresent - profit);
        if (profit >= pricePresent){
            System.out.printf("She is left with %.0f leva.", Math.floor(difference));}
        else {
            System.out.printf("She will have to borrow %.0f leva.", Math.ceil(difference));
        }



    }
}
