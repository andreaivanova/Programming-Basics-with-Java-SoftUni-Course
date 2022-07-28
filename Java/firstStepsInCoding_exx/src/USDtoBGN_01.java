import java.util.Scanner;

public class USDtoBGN_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        double dollars = Double.parseDouble(scanner.nextLine());
        double bgn = dollars * 1.79549;
        System.out.println(bgn);
    }
}
