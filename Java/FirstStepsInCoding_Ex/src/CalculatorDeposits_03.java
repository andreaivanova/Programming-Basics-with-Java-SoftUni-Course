import java.util.Scanner;

public class CalculatorDeposits_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double depositSum = Double.parseDouble(scan.nextLine());
        int period = Integer.parseInt(scan.nextLine());
        double interestRate = Double.parseDouble(scan.nextLine());
        double interest = depositSum * (interestRate / 100);
        double interestOneMonth = interest / 12;
        double totalSum = depositSum + period * interestOneMonth;
        System.out.println(totalSum);




    }
}
