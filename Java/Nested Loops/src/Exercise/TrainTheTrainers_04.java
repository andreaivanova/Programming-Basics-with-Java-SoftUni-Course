package Exercise;

import java.util.Scanner;

public class TrainTheTrainers_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine()); // broi na horata v jurito
        String presentationName = scanner.nextLine();
        double sumGrades = 0;
        double total = 0;
        boolean flag = false;
        int totalReceivedGrades = 0;
        while (!presentationName.equals("Finish")) {
            for (int i = 1; i <= n; i++) {
                double grade = Double.parseDouble(scanner.nextLine());
                sumGrades += grade;
                total += grade;
                totalReceivedGrades++;

            }

            System.out.printf("%s - %.2f.%n", presentationName , sumGrades / n);

            sumGrades = 0;
            presentationName = scanner.nextLine();
            if (presentationName.equals("Finish")){flag = true;

            }
        }

     if (flag){
         System.out.printf("Student's final assessment is %.2f.", total / totalReceivedGrades);
     }


    }

}

