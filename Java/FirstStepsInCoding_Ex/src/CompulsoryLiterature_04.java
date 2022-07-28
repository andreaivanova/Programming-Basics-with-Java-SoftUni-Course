import java.util.Scanner;

public class CompulsoryLiterature_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pagesCurrentBook = Integer.parseInt(scan.nextLine());
        int pagesOneHour = Integer.parseInt(scan.nextLine());
        int days = Integer.parseInt(scan.nextLine());
        int hoursRead = pagesCurrentBook / pagesOneHour;
        int hoursPerDay = hoursRead / days;
        System.out.println(hoursPerDay);
    }
}
