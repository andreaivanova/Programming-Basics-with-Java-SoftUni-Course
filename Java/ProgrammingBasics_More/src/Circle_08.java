import java.util.Scanner;

public class Circle_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        double radius = Double.parseDouble(scanner.nextLine());

        double area = (Math.PI * (radius * radius));
        double perimeter = 2 * Math.PI * radius;

        System.out.printf("%.2f", area);
        System.out.printf("%n%.2f", perimeter);


}
}
