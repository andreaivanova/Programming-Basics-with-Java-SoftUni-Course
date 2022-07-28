package Practice;

import java.util.Scanner;

public class Cake_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int amountOfPieces = width * length;

        String input = scanner.nextLine();
        while (!input.equals("STOP")){
            int piecesOfCake = Integer.parseInt(input);
            amountOfPieces -= piecesOfCake;
            if (amountOfPieces < 0){
                System.out.printf("No more cake left! You need %d pieces more.", Math.abs(amountOfPieces));
                break;
            }



           input = scanner.nextLine();
        }
        if (input.equals("STOP")){
            System.out.printf("%d pieces are left.", amountOfPieces);

        }
    }
}
