package Lab;

import java.util.Scanner;

public class Graduation_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String name = scanner.nextLine();
        int grade = 1; //klasa v uchislishte
        int poorGrades = 0;
        double allGrades = 0;

        while (grade <= 12){
            double yearGrade = Double.parseDouble(scanner.nextLine());

            if (yearGrade >= 4.00){
                poorGrades = 0;
                allGrades += yearGrade;
                grade++;

            } else {
                poorGrades++;
                if (poorGrades >= 2){
                    System.out.printf("%s has been excluded at %d grade", name, grade);
                    break;
                }

            }


        } if (grade > 12){
            System.out.printf("%s graduated. Average grade: %.2f", name, allGrades / 12);

        }



    }
}
