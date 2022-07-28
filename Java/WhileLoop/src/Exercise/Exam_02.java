package Exercise;

import java.util.Scanner;

public class Exam_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int allowedPoorGrades = Integer.parseInt(scanner.nextLine());//pozvoleni
        int counterPoorGrades = 0;
        int counterAllGrades = 0;
        int sumGrades = 0;
        String lastProblem = "";


        while (counterPoorGrades < allowedPoorGrades) {
            String name = scanner.nextLine();
            if (name.equals("Enough")) {
                System.out.printf("Average score: %.2f%n", sumGrades * 1.00 / counterAllGrades);
                System.out.printf("Number of problems: %d%n", counterAllGrades);
                System.out.printf("Last problem: %s", lastProblem);
                break;
            }
            lastProblem = name;
            int grade = Integer.parseInt(scanner.nextLine());
            counterAllGrades++;
            sumGrades += grade;
            if (grade <= 4) {
                counterPoorGrades++;

            }

            if (counterPoorGrades >= allowedPoorGrades){
                System.out.printf("You need a break, %d poor grades.", counterPoorGrades);
            }



        }


    }
}
