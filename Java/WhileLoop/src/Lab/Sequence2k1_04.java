package Lab;

import java.util.Scanner;

public class Sequence2k1_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int n = Integer.parseInt(scanner.nextLine());

        //2 * k + 1 - k e predishnoto chislo ot poredicata;
        //po tozi nachin namirane sledvashtoto chislo ot redicata;
        int k = 1; //k e predishnoto chislo ot poredicata
        //doakto k e po malko ot n shte vurtish cikula
        while (k <= n){
            System.out.println(k);
            k = k * 2 + 1;



        }





    }
}
