package Lab;

import java.util.Scanner;

public class Travelling_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //vynshiq cikul podava destinaciqta i minimalniq budjet
        //a vutreshniq chete sumite koito tq trqbva da spesti
        // dokato obshtata suma stane kolkoto ili poveche ot budjeta

        String destination = scanner.nextLine();

        while (!destination.equals("End")) {
            double neededMoney = Double.parseDouble(scanner.nextLine());
            double savedMoney = 0;
            while (savedMoney < neededMoney) {
                double currentMoney = Double.parseDouble(scanner.nextLine());
                savedMoney += currentMoney;

            }
            System.out.printf("Going to %s!%n", destination);
            destination = scanner.nextLine();
        }
    }
}
