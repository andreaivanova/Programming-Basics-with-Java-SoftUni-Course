import java.util.Scanner;

public class Aquarium_09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = Integer.parseInt(scan.nextLine());
        int width = Integer.parseInt(scan.nextLine());
        int height = Integer.parseInt(scan.nextLine());
        double percent = Double.parseDouble(scan.nextLine());

        double volume = length * width * height;
        double volumeLiters = volume / 1000;
        double space = percent / 100;
        double neededLiters = volumeLiters * (1 - space);

        System.out.println(neededLiters);

    }
}
