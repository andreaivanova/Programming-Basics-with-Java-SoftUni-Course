package Lab;

import java.util.Scanner;

public class InvalidNumber_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int number = Integer.parseInt(scanner.nextLine());
        boolean isValid = (number >= 100 && number <= 200) || number == 0;
        //Дадено число е валидно, ако е в диапазона [100…200] или(||) е 0
        if (!isValid){
            System.out.println("invalid");
        }

    }
}
