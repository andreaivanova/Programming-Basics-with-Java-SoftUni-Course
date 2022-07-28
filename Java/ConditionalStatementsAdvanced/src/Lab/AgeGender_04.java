package Lab;

import java.util.Scanner;

public class AgeGender_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double age = Double.parseDouble(scanner.nextLine());
        String gender = (scanner.nextLine());


        if (gender.equals("f")) {
            if (age >= 16) {
                System.out.println("Ms.");
            } else {
                System.out.println("Miss");
            }

        } else if (gender.equals("m")) {
            if (age >= 16) {
                System.out.println("Mr.");
            } else {
                System.out.println("Master");
            }
        }



       // switch (gender) {
         //   case "f":
           //     if (age >= 16) {
            //        System.out.println("Ms.");
           //     } else {
            //        System.out.println("Miss");
           //     }
          //      break;
         //   case "m":
           //     if (age >= 16) {
           //         System.out.println("Mr.");
           //     } else {
           //         System.out.println("Master");
          //      }
           //     break;


    }
}

