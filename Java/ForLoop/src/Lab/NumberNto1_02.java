package Lab;

import java.util.Scanner;

public class NumberNto1_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int n = Integer.parseInt(scanner.nextLine());

        //nachalo: n
        //kraina: 1
        //promqna: n--, -1

        for (int number = n; number >= 1; number--){
            System.out.println(number);


        }





    }
}
