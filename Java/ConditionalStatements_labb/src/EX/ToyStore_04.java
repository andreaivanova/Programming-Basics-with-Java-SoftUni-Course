package EX;

        import java.util.Scanner;

public class ToyStore_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceHoliday = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        double sumToys = puzzles * 2.60 + dolls * 3 +
                bears * 4.10 + minions * 8.20 + trucks * 2.00;
        int totalToys = puzzles + dolls + bears + minions + trucks;


        if (totalToys >= 50) {
            sumToys = sumToys - (sumToys * 0.25);
        }

        double rent = sumToys * 0.10;
        double profit = sumToys - rent;

        if (profit >= priceHoliday){
            System.out.printf("Yes! %.2f lv left.", profit - priceHoliday);
        } else {

            System.out.printf
                    ("Not enough money! %.2f lv needed.", priceHoliday - profit);}


    }
}
