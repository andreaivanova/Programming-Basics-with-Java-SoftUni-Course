import java.util.Scanner;

public class FishMarket_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        double skumriqPrice = Double.parseDouble(scanner.nextLine());
        double cacaPrice = Double.parseDouble(scanner.nextLine());
        double palamudKg = Double.parseDouble(scanner.nextLine());
        double safridKg = Double.parseDouble(scanner.nextLine());
        int midiKg = Integer.parseInt(scanner.nextLine());

        //•	Паламуд – 60% по-скъп от скумрията
        //•	Сафрид – 80% по-скъп от цацата
        //•	Миди – 7.50 лв. за килограм

        double palamudPrice = skumriqPrice + (skumriqPrice * 0.60);
        double palamudSum = palamudPrice * palamudKg;
        double safridPrice = cacaPrice + (cacaPrice * 0.80);
        double safridSum = safridPrice * safridKg;
        double midiSum = midiKg * 7.50;

        double totalSum = palamudSum + safridSum + midiSum;
        System.out.printf("%.2f", totalSum);





    }
}
