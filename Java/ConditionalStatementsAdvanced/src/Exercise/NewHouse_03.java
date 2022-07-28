package Exercise;

import java.util.Scanner;

public class NewHouse_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String flower = scanner.nextLine();
        int amountF = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double total = 0;


        switch (flower){
            case "Roses":
                total = amountF * 5.00;
                if (amountF > 80){
                    total = total - (total * 0.10);
                }
                break;


            case "Dahlias":
                total = amountF * 3.80;
                if (amountF > 90){
                    total = total - (total * 0.15);
                }
                break;


            case "Tulips":
                total = amountF * 2.80;
                if (amountF > 80){
                    total = total - (total * 0.15);
                }
                break;


            case "Narcissus":
                total = amountF * 3.00;
                if (amountF < 120){
                    total = total + (total * 0.15);
                }
                break;


            case "Gladiolus":
                total = amountF * 2.50;
                if (amountF < 80){
                    total = total + (total * 0.20);
                }
                break;



        }
        if(budget < total) {
            System.out.printf("Not enough money, you need %.2f leva more.", Math.abs(budget - total));

        } else {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", amountF, flower, (budget - total));
        }


    }
}
