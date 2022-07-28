package MoreExercises;

import java.util.Scanner;

public class Hospital_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int treated = 0;
        int untreated = 0;
        int treatedTemp = 0;
        int untreatedTemp = 0;
        int doctors = 7;

        for (int i = 1; i <= days; i++) {
            int patientsPerDay = Integer.parseInt(scanner.nextLine());
            if (i % 3 == 0 && untreated > treated) {
                doctors++;
                if (patientsPerDay <= doctors) {
                    treated += patientsPerDay;
                } else {
                    untreatedTemp = patientsPerDay - doctors;
                    treatedTemp = patientsPerDay - untreatedTemp;
                    treated += treatedTemp;
                    untreated += untreatedTemp;

                }

            } else {
                if (patientsPerDay <= doctors) {
                    treated += patientsPerDay;
                } else {
                    untreatedTemp = patientsPerDay - doctors;
                    treatedTemp = patientsPerDay - untreatedTemp;
                    treated += treatedTemp;
                    untreated += untreatedTemp;

                }


            }


        }
        System.out.printf("Treated patients: %d%nUntreated patients: %d", treated, untreated);











        }


    }


