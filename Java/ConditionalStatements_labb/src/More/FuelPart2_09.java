package More;

import java.util.Scanner;

public class FuelPart2_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String typeFuel = scanner.nextLine();
        double amountFuel = Double.parseDouble(scanner.nextLine());
        String yesOrNo = scanner.nextLine();

        double priceFuelPerLiter = 0;

        switch (typeFuel){
            case "Gasoline":
                priceFuelPerLiter = 2.22;
                if (yesOrNo.equals("Yes")){
                    priceFuelPerLiter = priceFuelPerLiter - 0.18;
                }
                break;
            case "Gas":
                priceFuelPerLiter = 0.93;
                if (yesOrNo.equals("Yes")){
                    priceFuelPerLiter = priceFuelPerLiter - 0.08;
                }
                break;
            case "Diesel":
                priceFuelPerLiter = 2.33;
                if (yesOrNo.equals("Yes")){
                    priceFuelPerLiter = priceFuelPerLiter - 0.12;
                }

                break;


        } double finalFuelPrice = priceFuelPerLiter * amountFuel;



        if (amountFuel >= 20 && amountFuel <= 25){
            finalFuelPrice = finalFuelPrice - finalFuelPrice * 0.08;

        } else if (amountFuel > 25) {
            finalFuelPrice = finalFuelPrice - finalFuelPrice * 0.10;

        }
        System.out.printf("%.2f lv.", finalFuelPrice);


    }
}
