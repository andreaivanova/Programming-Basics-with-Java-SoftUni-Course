import java.util.Scanner;

public class FoodDelivery_07 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        int chicken = Integer.parseInt(scanner.nextLine());
        int fish = Integer.parseInt(scanner.nextLine());
        int vegan = Integer.parseInt(scanner.nextLine());
        double chickenPrice = chicken * 10.35;
        double fishPrice = fish * 12.40;
        double veganPrice = vegan * 8.15;
        double totalPriceAllFood = chickenPrice + veganPrice + fishPrice;
        double desertPrice = totalPriceAllFood * 0.20;
        double deliveryPrice = 2.50;
        double totalPriceDelivery = totalPriceAllFood + deliveryPrice + desertPrice;
        System.out.println(totalPriceDelivery);
    }
}
