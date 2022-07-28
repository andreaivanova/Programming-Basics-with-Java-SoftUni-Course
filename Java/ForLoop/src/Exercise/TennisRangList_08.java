package Exercise;

import java.util.Scanner;

public class TennisRangList_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tournaments = Integer.parseInt(scanner.nextLine());
        int startingPoints = Integer.parseInt(scanner.nextLine());

     int points = 0;
    double win = 0;

        for (int i = 1; i <= tournaments; i++) {
            String stage = scanner.nextLine();
            switch (stage) {
                case "W":
                    points += 2000;
                    win++; //counter

                    //counting the games that he has won
                    // during all the tournaments
                    break;

                case "F":
                    points += 1200;
                    break;

                case "SF":
                    points += 720;
                    break;


            }


        } double percentWinnings = win / tournaments * 100;
        int totalPoints = startingPoints + points;
        double averagePoints = Math.floor(points * 1.00 / tournaments);
        System.out.printf("Final points: %d%n", totalPoints);
        System.out.printf("Average points: %.0f%n", averagePoints);
        System.out.printf("%.2f%%", percentWinnings);


    }
}
