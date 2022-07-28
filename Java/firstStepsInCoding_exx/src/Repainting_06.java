import java.util.Scanner;

public class Repainting_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int liquid = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double nylonSum = (nylon + 2) * 1.50;
        double paintSum = (paint + (paint * 0.10)) * 14.50;
        double liquidSum = liquid * 5;
        double bags = 0.40;

        double sumMaterials = nylonSum + paintSum + liquidSum + bags;
        double menHours = (sumMaterials * 0.30) * hours;
        double finalSum = sumMaterials + menHours;

        System.out.println(finalSum);




    }
}
