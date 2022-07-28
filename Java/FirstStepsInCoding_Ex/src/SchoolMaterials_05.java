import java.util.Scanner;

public class SchoolMaterials_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pens = Integer.parseInt(scan.nextLine());
        int markers = Integer.parseInt(scan.nextLine());
        int cleaner = Integer.parseInt(scan.nextLine());
        int discount = Integer.parseInt(scan.nextLine());

        double sumPens = pens * 5.80;
        double sumMarkers = markers * 7.20;
        double sumCleaner = cleaner * 1.20;

        double sumAll = sumPens + sumMarkers + sumCleaner;
        double sumAllWithDiscount = sumAll -(sumAll * (discount / 100.0));
        System.out.println(sumAllWithDiscount);






    }
}
