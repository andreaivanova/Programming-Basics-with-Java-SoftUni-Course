package Practice;

import java.rmi.MarshalException;
import java.util.Scanner;

public class Moving_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        int volume = width * height * length;
        int takenSpace = 0;
        String input = scanner.nextLine();
        while (!input.equals("Done")) {
            int boxes = Integer.parseInt(input);
            takenSpace += boxes;
            if (takenSpace > volume) {
                System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(volume - takenSpace));
                break;
            }


            input = scanner.nextLine();
        } if (input.equals("Done")){
            System.out.printf("%d Cubic meters left.", volume - takenSpace);


        }
    }
}
