package EX;

import java.util.Scanner;

public class WorldRecord_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        double record = Double.parseDouble(scanner.nextLine());

        double distance = Double.parseDouble(scanner.nextLine());
        double secPerM = Double.parseDouble(scanner.nextLine());

        double resistance = Math.floor(distance / 15) * 12.5;

        double ivanTime = distance * secPerM + resistance;

        if (ivanTime < record){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", ivanTime);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", ivanTime - record);
        }



    }
}
