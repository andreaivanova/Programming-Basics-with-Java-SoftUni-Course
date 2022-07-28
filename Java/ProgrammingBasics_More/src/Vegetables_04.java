import java.util.Scanner;

public class Vegetables_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceKgVeg = Double.parseDouble(scanner.nextLine());
        double priceKgFru = Double.parseDouble(scanner.nextLine());
        int totalKgVeg = Integer.parseInt(scanner.nextLine());
        int totalKgFru = Integer.parseInt(scanner.nextLine());

        double revenueVegBgn = priceKgVeg * totalKgVeg;
        double revenueFruBgn = priceKgFru * totalKgFru;
        double totalRevenueBgn = revenueFruBgn + revenueVegBgn;
        double totalRevenueEuro = totalRevenueBgn / 1.94;
        System.out.printf("%.2f", totalRevenueEuro);

    }

}
