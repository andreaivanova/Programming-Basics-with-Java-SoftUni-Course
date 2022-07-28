package MoreExercises;

import java.util.Scanner;

public class FootballLeague_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int capacityStadium = Integer.parseInt(scanner.nextLine());
        int fans = Integer.parseInt(scanner.nextLine());

        int aSector = 0;
        int bSector = 0;
        int vSector = 0;
        int gSector = 0;



        for (int i = 1; i <= fans; i++) {
            String sector = scanner.nextLine();
            switch (sector) {
                case "A":
                    aSector++;
                    break;
                case "B":
                    bSector++;
                    break;
                case "V":
                    vSector++;
                    break;
                case "G":
                    gSector++;
                    break;

            }

        }
        double aPercent = aSector * 1.00 / fans * 100;
        double bPercent = bSector * 1.00 / fans * 100;
        double vPercent = vSector * 1.00 / fans * 100;
        double gPercent = gSector * 1.00 / fans * 100;

        double percentAll = fans * 1.00 / capacityStadium * 100;

        System.out.printf("%.2f%%%n", aPercent);
        System.out.printf("%.2f%%%n", bPercent);
        System.out.printf("%.2f%%%n", vPercent);
        System.out.printf("%.2f%%%n", gPercent);
        System.out.printf("%.2f%%%n", percentAll);




    }
}
