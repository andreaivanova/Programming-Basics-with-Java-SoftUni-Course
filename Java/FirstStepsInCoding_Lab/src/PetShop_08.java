import java.util.Scanner;

public class PetShop_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int countDogs = Integer.parseInt(scanner.nextLine());
        int countCats = Integer.parseInt(scanner.nextLine());
        double priceDogs = countDogs * 2.50;
        double priceCats = countCats * 4;
        double all = priceDogs + priceCats;
        System.out.println(all + " lv.");
    }
}
