package Lab;

import java.util.Scanner;

public class Number1toN_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        //числата от 1 до н през 3

        for (int i = 1; i <= n; i += 3){
            System.out.println(i);
        }
    }

}

