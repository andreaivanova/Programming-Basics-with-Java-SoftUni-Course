package EX;

import java.util.Scanner;

public class WorldRecord_066 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
       double record =  Double.parseDouble(scanner.nextLine());
       double distance = Double.parseDouble(scanner.nextLine());
       double timePerMeter = Double.parseDouble(scanner.nextLine());

       double time = distance * timePerMeter;
       double resistance = Math.floor(distance / 15) * 12.5;
       double totalTime = time + resistance;


        if (totalTime >= record) {
            System.out.printf("No, he failed! He was %.2f seconds slower.", totalTime - record);}
        else{ System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTime);}






    }
}
