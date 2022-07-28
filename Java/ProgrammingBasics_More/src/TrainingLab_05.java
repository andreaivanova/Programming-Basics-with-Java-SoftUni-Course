import java.util.Scanner;

public class TrainingLab_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double w = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        //w = w *100;
        //h=h*100;
        //prezapisvane (zadavane) na nova stoinost na promenlivata

        //w - duljina v metri, h - shirochina v metri
        //one work space takes 70 * 120 cm space
        // (table 70 * 40cm and chair 70 * 80)
        //the hall is 100 cm - it will be subtracted
        //the front door and desk  - minus 3 spaces


        //razdelqme shirochinata na zalata na shirochinata na edno byuro (celochisleno)

        double desksPerRow = Math.floor((h - 1) / 0.7);


        //razdelqme duljinata na zalata  (celochisleno)

        double rows = Math.floor(w / 1.2);

        double spaces = (desksPerRow * rows) - 3;
        System.out.printf("%.0f", spaces);



        //import java.util.Scanner;
        //public class Zad{
        //public static void main(String[] args){
        //            Scanner scanner = new Scanner(System.in);
        //            double h = Double.parseDouble(scanner.nextLine());
        //            double w = Double.parseDouble(scanner.nextLine());
        //            double hCm = h * 100;
        //            double wCm = w * 100 - 100;
        //            double checkH = hCm / 120;
        //            double checkH2 = Math.floor(checkH);
        //            double checkW = wCm / 70;
        //            double checkW2 = Math.floor(checkW);
        //            double totalDesks = checkH2 * checkW2 - 3;
        //            System.out.println(totalDesks);
        //        }
        //}

    }
}
