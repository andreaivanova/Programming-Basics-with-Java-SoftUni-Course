import java.util.Scanner;

public class VegetableMarket_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        double priceVegetablesKg = Double.parseDouble(scanner.nextLine());
        double priceFruitsKg = Double.parseDouble(scanner.nextLine());
        int totalVegetablesKg = Integer.parseInt(scanner.nextLine());
        int totalFruitsKg = Integer.parseInt(scanner.nextLine());

        double vegetablesLv = priceVegetablesKg * totalVegetablesKg;
        double fruitsLv = priceFruitsKg * totalFruitsKg;
        double totalRevenueLv = vegetablesLv + fruitsLv;
        double totalRevenueEuro = totalRevenueLv / 1.94;

        System.out.printf("%.2f", totalRevenueEuro);
    }
}
