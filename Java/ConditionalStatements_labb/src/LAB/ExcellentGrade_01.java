package LAB;

import java.util.Scanner;

public class ExcellentGrade_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int grade = Integer.parseInt(scanner.nextLine());
        boolean isExcellent = grade >= 5;
        if (isExcellent) {
            System.out.println("Excellent!");
        }


    }
}
