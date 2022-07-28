package More;

import java.util.Scanner;

public class Firm_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int neededHours = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int workersExtra = Integer.parseInt(scanner.nextLine());

        double education = days * 0.10;
        double totalWorkTime = (days - education) * 8;
        double totalExtraTime = workersExtra * (2 * days);
        double total = Math.floor(totalWorkTime + totalExtraTime);
        double difference = Math.abs(total - neededHours);

        if(total >= neededHours){
            System.out.printf("Yes!%.0f hours left.", difference);
        } else {
            System.out.printf("Not enough time!%.0f hours needed.", difference);
        }




    }
}
