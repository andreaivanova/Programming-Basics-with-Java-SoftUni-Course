package Exercise;

import java.util.Scanner;

public class CinemaTickets_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String movie = scanner.nextLine();
        int studentCount = 0;
        int kidCount = 0;
        int standardCount = 0;
        int countTotalTickets = 0; // shte broi vsichki bileti izobshto

        while (!movie.equals("Finish")) {
            int freeSeats = Integer.parseInt(scanner.nextLine());
            String input = scanner.nextLine();
            int countCurrentMovieTickets = 0; // kolko bileti sme prodali
            // za konkretniq film
            while (!input.equals("End")) {
                countTotalTickets++;
               countCurrentMovieTickets++;
                switch (input) {
                    case "standard":
                        standardCount++;
                        break;
                    case "student":
                        studentCount++;
                        break;
                    case "kid":
                        kidCount++;
                        break;

                }

                if (countCurrentMovieTickets == freeSeats){
                    break;
                }
                input = scanner.nextLine();
            }
            System.out.printf("%s - %.2f%% full.%n" , movie, countCurrentMovieTickets * 1.00 / freeSeats * 100);

            movie = scanner.nextLine();
        }
        System.out.printf("Total tickets: %d%n", countTotalTickets);
        System.out.printf("%.2f%% student tickets.%n", studentCount * 1.00 / countTotalTickets * 100);
        System.out.printf("%.2f%% standard tickets.%n", standardCount * 1.00 / countTotalTickets * 100);
        System.out.printf("%.2f%% kids tickets.", kidCount * 1.00 / countTotalTickets * 100);




    }
}
