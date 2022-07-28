package Lab;

import java.util.Scanner;

public class SumNumbers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0; // nachalna  tochka
        while (sum < number){//kraina tochka // cikyla shte se vurti dokato sumata e po malka
            int num = Integer.parseInt(scanner.nextLine());
            sum += num;

//while (true){// cikula shte se prekusne kogato stane po golqmo ili ravno
// if (sum >= number){break}}


        }
        System.out.println(sum);

    }
}
