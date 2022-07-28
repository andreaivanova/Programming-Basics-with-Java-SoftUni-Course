package More;

import java.util.Scanner;

public class System_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int expectedSum = Integer.parseInt(scanner.nextLine());
        int totalSum = 0;
        int totalCash = 0;
        int totalCreditCard = 0;
        int countDays = 0;
        int countCash = 0;
        int countCrediCard = 0;

        //reduvat se vinagi plashtane v broi (1) i plashtane s karta(2)

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            int priceOfItems = Integer.parseInt(input);
            countDays++;
            if (countDays % 2 == 0) // by credit card
            {
                if (priceOfItems <= 10) {
                    System.out.println("Error in transaction!");
                } else {
                    System.out.println("Product sold!");
                    totalSum += priceOfItems;
                    totalCreditCard += priceOfItems;
                    countCrediCard++;
                }
            } else {
                if (priceOfItems <= 100) //with cash
                {
                    System.out.println("Product sold!");
                    totalSum += priceOfItems;
                    totalCash += priceOfItems;
                    countCash++;
                } else {
                    System.out.println("Error in transaction!");
                }

            }
            if (totalSum >= expectedSum) {
                    System.out.printf("Average CS: %.2f%nAverage CC: %.2f", (totalCash * 1.00 / countCash), (totalCreditCard * 1.00 / countCrediCard));
                    break;
            }


            input = scanner.nextLine();
        } if(input.equals("End")){
            System.out.println("Failed to collect required money for charity.");

        }


    }
}
