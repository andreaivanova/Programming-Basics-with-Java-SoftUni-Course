package Exercise;

import java.util.Scanner;

public class Coins_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double change = Double.parseDouble(scanner.nextLine());
        int counter = 0; //za stotinkite, kolko stotinki vrushtame

        double coins = change * 100; // preobrazuvame levovete v
        // stotinki, zashtoto ako imame 2 merni edinici v edna zadacha,
        //vinagi trqbva da rabotim s po-malkata

        while (coins != 0) {
            if (coins >= 200) {
                coins -= 200; // naprimer ako imame 2.53 lv, veche sme
                // dali 2 lv  i ostavame s 53st , zatova vadim 200 ot coins

                //zapochvame ot nai-golqmata moneta zashtoto v uslovieto
                // se iska da vurnem kolkoto se moje po-malko moneti.
                counter++;
            } else if (coins >= 100) {
                coins -= 100;
                counter++;
            } else if (coins >= 50) {
                coins -= 50;
                counter++;
            } else if (coins >= 20) {
                coins -= 20;
                counter++;
            } else if (coins >= 10) {
                coins -= 10;
                counter++;
            } else if (coins >= 5) {
                coins -= 5;
                counter++;
            } else if (coins >= 2) {
                coins -= 2;
                counter++;
            } else if (coins >= 1) {
                coins -= 1;
                counter++;
            } else {
                break;
            }

        }
        System.out.println(counter);


    }
}
