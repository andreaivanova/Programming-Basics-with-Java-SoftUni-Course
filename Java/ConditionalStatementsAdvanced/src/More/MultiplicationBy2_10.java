package More;

import java.util.Scanner;

public class MultiplicationBy2_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.nextLine());
        double result = 0;
        while (number >= 0) {
            result = number * 2;
            System.out.printf("Result: %.2f%n", result);


            number = Double.parseDouble(scanner.nextLine());
        }
        if (number < 0){
            System.out.println("Negative number!");

    }


    }
}

