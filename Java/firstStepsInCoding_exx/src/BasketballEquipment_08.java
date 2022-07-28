import java.util.Scanner;

public class BasketballEquipment_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int annualTax = Integer.parseInt(scanner.nextLine());

        double sneakers = annualTax - (annualTax * 0.4);
        // =annualTax * (1-0.40) ili =taksa - (taksa * 40 /100.00)
        double kit = sneakers - (sneakers * 0.2);
        // kit= sneakers * (1-0.20) ili =sneakers - (sneakers * 20 / 100.00)
        double ball = kit * 0.25;
        double accessories = ball * 0.2;

        double expenses = annualTax + sneakers + kit + ball + accessories;

        System.out.println(expenses);
    }
}
