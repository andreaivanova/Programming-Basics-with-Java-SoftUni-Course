package EX;

import java.util.Scanner;

public class Shopping_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int video = Integer.parseInt(scanner.nextLine());
        int pr = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());

        double sumVideo = video * 250.00;

        double  prPrice = sumVideo * 0.35;
        double ramPrice = sumVideo * 0.10;

        double totalSum = sumVideo + (pr * prPrice) + (ram * ramPrice);


        if(video > pr) {totalSum = totalSum * 0.85;}

        if (totalSum <= budget) {
            System.out.printf("You have %.2f leva left!", budget - totalSum);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", Math.abs(budget - totalSum));
        }







    }



    }

