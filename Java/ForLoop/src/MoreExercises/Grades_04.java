package MoreExercises;

import java.util.Scanner;

public class Grades_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentsAmount = Integer.parseInt(scanner.nextLine());

        int topStudents = 0;
        int between4and499 = 0;
        int between3and399 = 0;
        int fail = 0;
        double sumAllGrades = 0;


        for (int i = 1; i <= studentsAmount; i++) {
            double gradeExam = Double.parseDouble(scanner.nextLine());
            sumAllGrades += gradeExam;
            if (gradeExam < 3) {
                fail++;
            } else if (gradeExam >= 3 && gradeExam < 4) {
                between3and399++;
            } else if (gradeExam >= 4 && gradeExam < 5) {
                between4and499++;
            } else {
                topStudents++;
            }




        }
        double average = sumAllGrades / studentsAmount * 1.00;
        double percentFail = fail * 1.00 / studentsAmount * 100;
        double percentBetween3and399 = between3and399 * 1.00 / studentsAmount * 100;
        double percentBetween4and499 = between4and499 * 1.00 / studentsAmount * 100;
        double percentTopStudents = topStudents * 1.00 / studentsAmount * 100;

        //Top students: 30.00%
        //Between 4.00 and 4.99: 30.00%
        //Between 3.00 and 3.99: 20.00%
        //Fail: 20.00%
        //Average: 4.06
        System.out.printf("Top students: %.2f%%%n", percentTopStudents);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", percentBetween4and499);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", percentBetween3and399);
        System.out.printf("Fail: %.2f%%%n", percentFail);
        System.out.printf("Average: %.2f", average);


    }
}
