import java.util.Scanner;

public class Houses_009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double meters = Double.parseDouble(scanner.nextLine());
        double priceGreen = meters * 7.61;
        double discount = priceGreen * 0.18;
        double finalPrice = priceGreen - discount;

        System.out.printf("The final price is: %f lv.", finalPrice);
        System.out.printf("The discount is: %f lv.", discount);
    }
}
