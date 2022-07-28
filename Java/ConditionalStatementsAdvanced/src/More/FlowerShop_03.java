package More;

import java.util.Scanner;

public class FlowerShop_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hrizantemiAmount = Integer.parseInt(scanner.nextLine());
        int rosesAmount = Integer.parseInt(scanner.nextLine());
        int tulipsAmount = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String yesOrNo = scanner.nextLine();

        double totalPayment = 0;


        switch (season) {
            case "Spring":
            case "Summer":
                totalPayment = hrizantemiAmount * 2.00 + rosesAmount * 4.10 + tulipsAmount * 2.50;
                break;

            case "Autumn":
            case "Winter":
                totalPayment = hrizantemiAmount * 3.75 + rosesAmount * 4.50 + tulipsAmount * 4.15;

                break;

        }

        double totalFlowers = hrizantemiAmount + rosesAmount + tulipsAmount;


        if (yesOrNo.equals("Y")){
            totalPayment = totalPayment + totalPayment * 0.15;}

        if (season.equals("Spring") && tulipsAmount > 7){
            totalPayment = totalPayment - totalPayment * 0.05; }

        if (season.equals("Winter") && rosesAmount >= 10) {
            totalPayment = totalPayment - totalPayment * 0.10;
        }


        if (totalFlowers > 20){
            totalPayment = totalPayment - totalPayment * 0.20; }

        totalPayment = totalPayment + 2;
        System.out.printf("%.2f", totalPayment);



    }
}