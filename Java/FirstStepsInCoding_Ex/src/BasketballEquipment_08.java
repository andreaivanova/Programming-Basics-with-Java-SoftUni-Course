import java.util.Scanner;

public class BasketballEquipment_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int annualTax = Integer.parseInt(scanner.nextLine());
        double sneakers = annualTax - (annualTax * 0.4);
        double equipment = sneakers - (sneakers * 0.2);
        double ball = equipment * 0.25;
        double accessories = ball * 0.20;
        double totalPrice = annualTax + sneakers + equipment + ball + accessories;
        System.out.println(totalPrice);
    }
}
