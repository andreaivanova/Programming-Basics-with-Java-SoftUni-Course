package More;

import java.util.Scanner;

public class Pets_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int leftFoodKg = Integer.parseInt(scanner.nextLine());
        double dogFoodKg = Double.parseDouble(scanner.nextLine());
        double catFoodKg = Double.parseDouble(scanner.nextLine());
        double turtleFoodGrams = Double.parseDouble(scanner.nextLine());

        double dogFood2 = dogFoodKg * days;
        double catFood2 = catFoodKg * days;
        double turtleFood2 = (turtleFoodGrams / 1000) * days;
        double totalFood = dogFood2 + catFood2 + turtleFood2;
        double difference = Math.abs(leftFoodKg - totalFood);

        if(totalFood <= leftFoodKg){
            System.out.printf("%.0f kilos of food left.", Math.floor(difference));
        }else {System.out.printf("%.0f more kilos of food are needed.", Math.ceil(difference));}


    }
}
