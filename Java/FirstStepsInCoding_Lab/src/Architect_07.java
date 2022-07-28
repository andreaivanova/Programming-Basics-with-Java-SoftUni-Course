import java.sql.SQLOutput;
import java.util.Scanner;

public class Architect_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int projects = Integer.parseInt(scan.nextLine());
        int hours = projects * 3;
        System.out.printf("The architect %s will need %d hours to complete %d project/s.", name, hours, projects);

    }
}
