package Exercise;

import java.util.Scanner;

public class SumNumbers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String input = scanner.nextLine();
        int primeSum = 0;
        int nonPrimeSum = 0;
        while (!input.equals("stop")){
            int number = Integer.parseInt(input);
            if (number < 0) {
                System.out.println("Number is negative.");
                input = scanner.nextLine();
                continue;
            }
            boolean flag = true; // по презумция приемаме че числото е просто
            for (int i = 2; i <= number - 1 ; i++) { //tova sa nashite deliteli ,
                // izkluchvame edno (zatova cikula zapochva ot 2)i
                // samoto chislo (kato napishem n - 1),
                //zashtoto vsqko chislo se deli na 1 i na sebe si
                if (number % i == 0){
                    nonPrimeSum += number;
                    flag = false;
                    break;
                }

            }
            if (flag){
                primeSum += number;
            }



            input = scanner.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d%n" +
                "Sum of all non prime numbers is: %d", primeSum, nonPrimeSum);
    }
}
