package Exercise;

import java.util.Scanner;

public class PyramidOfNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = false;
        int n = Integer.parseInt(scanner.nextLine());
        int currentNumber = 0;
        //tova pazi na koi red sme i na nas ni se otpechetvayt
        // tolkova chisla kolkoto sa redovete
        for (int rows = 1; rows <= n; rows++) {
            for (int columns = 1; columns <= rows; columns++) {
                currentNumber++;
                if (currentNumber > n) {
                    flag = true;
                    break;
                }
                // kolko koloni imame na current red
                System.out.print(currentNumber + " ");

            }
            if (flag) {
                break;
            }
            System.out.println();


        }
    }
}
