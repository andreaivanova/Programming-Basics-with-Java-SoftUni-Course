package Exercise;

import java.util.Scanner;

public class Oscars_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String actorName = scanner.nextLine();
        double pointsAcademy = Double.parseDouble(scanner.nextLine());
        int judgesCount = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= judgesCount ; i++) {
            String judgeName = scanner.nextLine();
            double pointsJudge = Double.parseDouble(scanner.nextLine());
            int length = judgeName.length();
            pointsAcademy += (length * pointsJudge) / 2;
            if (pointsAcademy >= 1250.5){
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName, pointsAcademy);
                break;}

        }


            if (pointsAcademy < 1250.5)  {System.out.printf("Sorry, %s you need %.1f more!",
                    actorName, 1250.5 - pointsAcademy);}

    }
}
