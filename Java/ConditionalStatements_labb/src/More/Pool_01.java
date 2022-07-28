package More;

import java.util.Scanner;

public class Pool_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int volumePool = Integer.parseInt(scanner.nextLine());
        int debitFirstTube = Integer.parseInt(scanner.nextLine());
        int debitSecondTube = Integer.parseInt(scanner.nextLine());
        double hoursAbsence = Double.parseDouble(scanner.nextLine());

        double litersFirstTube = debitFirstTube * hoursAbsence;
        double litersSecondTube = debitSecondTube * hoursAbsence;
        double litersTotal = litersFirstTube + litersSecondTube;
        double volumePercent = litersTotal * 100.00 / volumePool;;
        //literstotal 660
        //litersfirsttube = 300
        //litersseocndtube = 360

        if (litersTotal <= volumePool) {



            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.", volumePercent, (litersFirstTube * 100) / litersTotal, (litersSecondTube * 100) / litersTotal);
        } else {
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", hoursAbsence, Math.abs(volumePool - litersTotal));
        }



    }
}
