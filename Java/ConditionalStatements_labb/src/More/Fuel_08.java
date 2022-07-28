package More;

import java.util.Scanner;

public class Fuel_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String typeFuel = scanner.nextLine();
        double liters = Double.parseDouble(scanner.nextLine());

        switch (typeFuel) {
            case "Diesel":
                if (liters < 25) {
                    System.out.println("Fill your tank with diesel!");
                } else if (liters >= 25) {
                    System.out.println("You have enough diesel.");
                }
                break;
            case "Gasoline":
                if (liters < 25) {
                    System.out.println("Fill your tank with gasoline!");
                } else if (liters >= 25) {
                    System.out.println("You have enough gasoline.");
                }
                break;
            case "Gas":
                if (liters < 25) {
                    System.out.println("Fill your tank with gas!");
                } else if (liters >= 25) {
                    System.out.println("You have enough gas.");
                }
                break;


        }

        if (!typeFuel.equals("Diesel") && !typeFuel.equals("Gasoline") && !typeFuel.equals("Gas")) {
            System.out.println("Invalid fuel!");
        }


    }


}

