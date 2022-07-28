package Exercise;

import java.util.Scanner;

public class HotelRoom_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());

        double studio = 0;
        double apartment = 0;

        switch (month){
            case "May":
            case "October":
                studio = 50;
                apartment = 65;
                if (nights > 7 && nights <= 14) {
                    studio = studio - studio * 0.05;

                } else if (nights > 14){
                    studio = studio - studio * 0.30;
                    apartment = apartment - apartment * 0.10;
                }
                break;

            case "June":
            case "September":
                studio = 75.20;
                apartment = 68.70;
                if (nights > 14) {
                    studio = studio - studio * 0.20;
                    apartment = apartment - apartment * 0.10;;
                }

                break;
            case "July":
            case "August":
                studio = 76;
                apartment = 77;
               if (nights > 14) {apartment = apartment - apartment * 0.10;}

        }
        System.out.printf("Apartment: %.2f lv.%n", apartment * nights);
        System.out.printf("Studio: %.2f lv.", studio * nights);
        }
        }











