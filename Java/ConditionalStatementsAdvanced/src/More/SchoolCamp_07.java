package More;

import java.util.Scanner;

public class SchoolCamp_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String season = scanner.nextLine();
        String typeGroup = scanner.nextLine();
        int studentsAmount = Integer.parseInt(scanner.nextLine());
        int nightsAmount = Integer.parseInt(scanner.nextLine());

        String typeSport = "";
        double nightPrice = 0;

        switch (season) {
            case "Winter":
                if (typeGroup.equals("boys") || typeGroup.equals("girls")){
                    nightPrice = 9.60;
                } else if (typeGroup.equals("mixed")){
                    nightPrice = 10;
                }
                 break;
            case "Spring":
                if (typeGroup.equals("boys") || typeGroup.equals("girls")){
                    nightPrice = 7.20;
                } else if (typeGroup.equals("mixed")){
                    nightPrice = 9.50;
                }
                break;
            case "Summer":
                if (typeGroup.equals("boys") || typeGroup.equals("girls")){
                    nightPrice = 15.00;
                } else if (typeGroup.equals("mixed")){
                    nightPrice = 20.00;
                }
                break;



        } double totalNightPrice = nightPrice * nightsAmount * studentsAmount;

        if (studentsAmount >= 10 && studentsAmount < 20){
            totalNightPrice = totalNightPrice - totalNightPrice * 0.05;
        } else if (studentsAmount >= 20 && studentsAmount < 50){
            totalNightPrice = totalNightPrice - totalNightPrice * 0.15;
        } else if (studentsAmount >=50)  {totalNightPrice = totalNightPrice - totalNightPrice * 0.50;}


        switch (season){
            case "Winter":
                if (typeGroup.equals("girls")){
                    typeSport = "Gymnastics";
                } else if (typeGroup.equals("boys")){
                    typeSport = "Judo";
                } else if (typeGroup.equals("mixed")){
                    typeSport = "Ski";
                }
                break;


            case "Spring":
                if (typeGroup.equals("girls")){
                    typeSport = "Athletics";
                } else if (typeGroup.equals("boys")){
                    typeSport = "Tennis";
                } else if (typeGroup.equals("mixed")){
                    typeSport = "Cycling";
                }

                break;

            case "Summer":
                if (typeGroup.equals("girls")){
                    typeSport = "Volleyball";
                } else if (typeGroup.equals("boys")){
                    typeSport = "Football";
                } else if (typeGroup.equals("mixed")){
                    typeSport = "Swimming";
                }

                break;




        }
        System.out.printf("%s %.2f lv.", typeSport, totalNightPrice);




    }
}
