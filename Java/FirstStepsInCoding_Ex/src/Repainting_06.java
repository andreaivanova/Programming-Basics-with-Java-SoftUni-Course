import java.util.Scanner;

public class Repainting_06  {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nylon = Integer.parseInt(scan.nextLine());
        int paint = Integer.parseInt(scan.nextLine());
        int liquidPaint = Integer.parseInt(scan.nextLine());
        int hours = Integer.parseInt(scan.nextLine());

        double sumNylon = (nylon + 2) * 1.50;
        double sumPaint = ((paint + 1.10) * 14.50);
        double sumLiquidPaint = liquidPaint * 5.0;
        double bags = 0.40;
        double sumAllMaterials = sumNylon + sumPaint + sumLiquidPaint + bags;
        double sumMasters = (sumAllMaterials * 0.30) * hours;
        double finalSum = sumAllMaterials + sumMasters;
        System.out.println(finalSum);



    }
}
