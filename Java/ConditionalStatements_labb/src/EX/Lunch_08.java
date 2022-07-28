package EX;

import java.util.Scanner;

public class Lunch_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String series = (scanner.nextLine());
        int timeSeries = Integer.parseInt(scanner.nextLine());
        int timeBreak = Integer.parseInt(scanner.nextLine());

        double timeLunch = timeBreak / 8;
        double timeRelax = timeBreak / 4;
        double timeLeft = timeBreak - timeLunch - timeRelax;

        if (timeLeft >= timeSeries){
            System.out.printf("You have enough time to watch %s and left with %f minutes free time.", series, Math.ceil(timeLeft - timeSeries));
        }else {
            System.out.printf("You don't have enough time to watch %s, you need %f more minutes.", series, Math.ceil(timeSeries - timeLeft));
        }



    }
}
