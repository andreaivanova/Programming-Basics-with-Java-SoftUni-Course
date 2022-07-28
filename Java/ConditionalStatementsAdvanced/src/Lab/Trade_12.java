package Lab;

import java.util.Scanner;

public class Trade_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String town = (scanner.nextLine());
        double sells = Double.parseDouble(scanner.nextLine());
        double percent = 0;
        double result = 0;


        switch (town) {
            case "Sofia":
                if (sells >= 0 && sells <= 500) {
                    percent = 0.05;
                } else if (sells <= 1000) {
                    percent = 0.07;
                } else if (sells <= 10000) {
                    percent = 0.08;
                } else {
                    percent = 0.12;
                }
                result = sells * percent;


                break;

            case "Varna":
                if (sells >= 0 && sells <= 500) {
                    percent = 0.045;
                } else if (sells <= 1000) {
                    percent = 0.075;
                } else if (sells <= 10000) {
                    percent = 0.10;
                } else {
                    percent = 0.13;
                }
                result = sells * percent;


                break;
            case "Plovdiv":
                if (sells >= 0 && sells <= 500) {
                    percent = 0.055;
                } else if (sells <= 1000) {
                    percent = 0.08;
                } else if (sells <= 10000) {
                    percent = 0.12;
                } else {
                    percent = 0.145;
                }
                result = sells * percent;


                break;


        }
        if (sells < 0 || !town.equals("Sofia") && !town.equals("Varna")
                && !town.equals("Plovdiv")) {
            System.out.println("error");
        } else {
            System.out.printf("%.2f", result);
        }

    }
}

