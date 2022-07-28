package EX;

import java.util.Scanner;

public class lunch_088 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String name = (scanner.nextLine());
        int durationEpisode = Integer.parseInt(scanner.nextLine());
        int durationBreak = Integer.parseInt(scanner.nextLine());

        double timeForLunch = durationBreak / 8.0;
        double timeForRelax = durationBreak / 4.0;
        double timeLeft = durationBreak - (timeForLunch + timeForRelax);

        if (timeLeft >= durationEpisode){
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", name, Math.ceil(timeLeft - durationEpisode));

        }else {System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", name, Math.ceil(durationEpisode - timeLeft));}


    }
}
