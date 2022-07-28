package MoreExercises;

import java.util.Scanner;

public class Bills_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int months = Integer.parseInt(scanner.nextLine());
        double waterBill = 0;
        double internetBill = 0;
        double otherBills = 0;
        double sumElectricityBill = 0;

        double total = 0;



        for (int i = 1; i <= months ; i++) {
            double electricityBill = Double.parseDouble(scanner.nextLine());
            otherBills += (electricityBill + 20 + 15) + ((electricityBill + 20 + 15) * 0.20);

            waterBill += 20;
            internetBill += 15;


            sumElectricityBill += electricityBill;





        } total = sumElectricityBill + otherBills + waterBill + internetBill;
        double average = total / months;


        //Electricity: 447.16 lv
        //Water: 100.00 lv
        //Internet: 75.00 lv
        //Other: 746.59 lv
        //Average: 273.75 lv

        System.out.printf("Electricity: %.2f lv%n", sumElectricityBill);
        System.out.printf("Water: %.2f lv%n", waterBill);
        System.out.printf("Internet: %.2f lv%n", internetBill);
        System.out.printf("Other: %.2f lv%n", otherBills);
        System.out.printf("Average: %.2f lv%n", average);


    }
}
