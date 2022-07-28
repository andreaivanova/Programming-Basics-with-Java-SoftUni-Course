package Lab;

import java.util.Scanner;

public class AccountBalance_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String input = scanner.nextLine();
        double sum = 0;

        while (!input.equals("NoMoreMoney")){

          double currentSum =  Double.parseDouble(input);//convert String to double
            //if the inputed number is negative , the program stops working
            if (currentSum < 0){
                System.out.println("Invalid operation!");
                break;
            }
                sum += currentSum;
            System.out.printf("Increase: %.2f%n", currentSum);

            input = scanner.nextLine();
        }
        System.out.printf("Total: %.2f", sum);
    }
}
