package More;

import java.util.Scanner;

public class Transport_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int km = Integer.parseInt(scanner.nextLine());
        String dayOrNight = (scanner.nextLine());
        double price = 0;
        double taxiRate = 0;


        if (dayOrNight.equals("day")) {
            taxiRate = 0.79;

        } else if (dayOrNight.equals("night")) {
            taxiRate = 0.90;
        }
        double taxiRateBusTrain = 0;

        if (km < 20 ){
            price = 0.70 + (taxiRate * km);
        } else if (km < 100){
            taxiRateBusTrain = 0.09;
            price = taxiRateBusTrain * km;
        } else {
            taxiRateBusTrain = 0.06;
            price = taxiRateBusTrain * km;
        }
        System.out.printf("%.2f", price);


    }
}
