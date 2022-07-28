import java.util.Scanner;

public class CelciusToFar_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        double c = Double.parseDouble(scanner.nextLine());
        double far = (c * 9 / 5) + 32;
        System.out.printf("%.2f", far);
    }
}
