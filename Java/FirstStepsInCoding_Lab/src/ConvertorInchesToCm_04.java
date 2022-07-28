import java.util.Scanner;

public class ConvertorInchesToCm_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        double a = Double.parseDouble (scanner.nextLine());
        double inches = 2.54;
        double answer =  a * inches;
        System.out.println(answer);



    }
}
