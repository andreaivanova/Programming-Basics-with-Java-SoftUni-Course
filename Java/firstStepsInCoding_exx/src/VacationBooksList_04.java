import java.util.Scanner;

public class VacationBooksList_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int pagesCurrentBook = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int timeBook = pagesCurrentBook / pagesPerHour;
        int timeDay = timeBook / days;
        System.out.println(timeDay);


    }
}
