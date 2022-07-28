package Exercise;

import java.util.Scanner;

public class Cake_06 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner (System.in);
       int width = Integer.parseInt(scanner.nextLine());
       int length = Integer.parseInt(scanner.nextLine());

       int totalPieces = width * length;
       while (totalPieces >= 0){
           String input = scanner.nextLine();
           if (input.equals("STOP")){
               break;
           }
           int currentPieces = Integer.parseInt(input); // parsvame ot
           // inputa zashtoto dori i chislata vuvedeni ot konzolata zaedno s komandata
           //STOP se chetat kato String i za da rabotim po natatyk s tezi chisla go parsvame
           //v promenliva integer.

           totalPieces -= currentPieces;
       }

       if (totalPieces > 0){
           System.out.printf("%d pieces are left.", totalPieces);

       }else {
           System.out.printf("No more cake left! " +
                   "You need %d pieces more.", Math.abs(totalPieces));


       }



    }
}
