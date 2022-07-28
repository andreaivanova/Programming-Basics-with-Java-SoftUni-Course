package Lab;

import java.util.Scanner;

public class Password_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String username = scanner.nextLine();
        String password = scanner.nextLine();//1234

        String inputPassword = scanner.nextLine();//1234
        while (!inputPassword.equals(password)){


            inputPassword = scanner.nextLine();
        }
        System.out.println("Welcome " + username + "!");
    }
}
