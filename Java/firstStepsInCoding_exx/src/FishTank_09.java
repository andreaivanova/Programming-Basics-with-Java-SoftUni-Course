import java.util.Scanner;

public class FishTank_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double volume = length * width * height;
        double volumeLiters = volume / 1000;
        double takenSpace = percent / 100;
        double neededLiters = volumeLiters * (1 - takenSpace);

        System.out.println(neededLiters);
    }
}
