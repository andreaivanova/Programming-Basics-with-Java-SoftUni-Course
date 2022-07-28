import java.util.Scanner;

public class PetShop_008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dogFood = Integer.parseInt(scanner.nextLine());
        int catFood = Integer.parseInt(scanner.nextLine());

        double priceDogFood = 2.50;
        double priceCatFood = 4;

        double allDogs = dogFood * priceDogFood;
        double allCats = catFood * priceCatFood;

        double sum = allCats + allDogs;

        System.out.printf("%f lv.", sum);

    }
}