package More;

import java.util.Scanner;

public class TicketsForGame_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int peopleAmount = Integer.parseInt(scanner.nextLine());

        double tickets = 0;
        double leftMoney = 0;

        switch (category) {
            case "VIP":
                tickets = 499.99;
                break;
            case "Normal":
                tickets = 249.99;
                break;
        }

        if (peopleAmount >= 1 && peopleAmount <= 4) {
            leftMoney = budget - budget * 0.75;
        } else if (peopleAmount >= 5 && peopleAmount <= 9) {
            leftMoney = budget - budget * 0.60;
        } else if (peopleAmount >= 10 && peopleAmount <= 24) {
            leftMoney = budget - budget * 0.50;
        } else if (peopleAmount >= 25 && peopleAmount <= 49) {
            leftMoney = budget - budget * 0.40;
        } else {
            leftMoney = budget - budget * 0.25;
        }

        double ticketsTotalPrice = tickets * peopleAmount;
        if (ticketsTotalPrice <= leftMoney){
            System.out.printf("Yes! You have %.2f leva left.", leftMoney - ticketsTotalPrice);
        }
        else {
            System.out.printf("Not enough money! You need %.2f leva.", ticketsTotalPrice - leftMoney);
        }


    }
}
