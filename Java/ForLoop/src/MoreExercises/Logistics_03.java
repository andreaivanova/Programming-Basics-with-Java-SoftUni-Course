package MoreExercises;

import java.util.Scanner;

public class Logistics_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amountCargo = Integer.parseInt(scanner.nextLine());
        int sumAllCargos = 0;
        double pricePerTon = 0;
        int countBus = 0;
        int countTruck = 0;
        int countTrain = 0;


        for (int i = 1; i <= amountCargo; i++) {
            int cargos = Integer.parseInt(scanner.nextLine());
            sumAllCargos += cargos;


            if (cargos <= 3) {

                countBus += cargos;

            } else if (cargos <= 11) {

                countTruck += cargos;
            } else {

                countTrain += cargos;
            }


        }
        double totalBus = countBus * 200;
        double totalTruck = countTruck * 175;
        double totalTrain = countTrain * 120;
        double percentBus = countBus * 1.00 / sumAllCargos * 100;
        double percentTruck = countTruck * 1.00 / sumAllCargos * 100;
        double percentTrain = countTrain * 1.00 / sumAllCargos * 100;


        double average = (totalBus + totalTrain + totalTruck) / sumAllCargos;
        System.out.printf("%.2f%n", average);
        System.out.printf("%.2f%%%n", percentBus);
        System.out.printf("%.2f%%%n", percentTruck);
        System.out.printf("%.2f%%%n", percentTrain);




    }
}
