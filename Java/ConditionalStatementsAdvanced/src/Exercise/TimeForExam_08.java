package Exercise;

import java.util.Scanner;

public class TimeForExam_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int examHour = Integer.parseInt(scanner.nextLine());
        int examMin = Integer.parseInt(scanner.nextLine());
        int arrivalHour = Integer.parseInt(scanner.nextLine());
        int arrivalMin = Integer.parseInt(scanner.nextLine());

        int examAllMin = examHour * 60 + examMin;
        int arrivalAllMin = arrivalHour * 60 + arrivalMin;
        int diff = Math.abs(examAllMin - arrivalAllMin);
        int hour = diff / 60;
        int min = diff % 60;

        if (examAllMin < arrivalAllMin) {
            System.out.println("Late");
            if (diff <= 59) {
                System.out.printf("%d minutes after the start", diff);
            } else {
                System.out.printf("%d:%02d hours after the start", hour, min);
            }
        } else if (examAllMin == arrivalAllMin || diff <= 30) {
            System.out.println("On time");
            if (diff != 0) {
                System.out.printf("%d minutes before the start", diff);
            }

        } else {

            System.out.println("Early");
            if(diff <= 59){
                System.out.printf("%d minutes before the start", diff);
            } else {
                System.out.printf("%d:%02d hours before the start", hour, min);
            }

        }


    }
}
