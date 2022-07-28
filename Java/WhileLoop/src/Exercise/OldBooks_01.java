package Exercise;

import java.util.Scanner;

public class OldBooks_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String wantedBook = scanner.nextLine();
        int counter = 0;
        boolean isFound = false;
        //counter koito broi kolko knigi se premiali
        // kolko iteracii sme napravili v while cikula


        String input = scanner.nextLine(); //trqbva ni neshto kooeto ni chete vhoda
        // tova koeto na vsqka iteraciq shte chte vhoda //nachalo na cikula
// pravim si flag za da razberem koga sm em namerili kniga
// flaga e obiknovena booleva promenliva  boolean moje da e true ili false
        // boolean isfound = false   po prezumpciq si slagame false , purvonachalno priemame
        //che ne sme  namerili kniig i ako vlezem v if-a i imam suvpadenie na dvete imena
        // iskam  da vdigna flag i pishe Isfound = true , tova znachi che sme namrili knigata
        // if (isfound) - e true (taka se zapisva ako  e true) i otpechetvame tova koeto iskame
        // i else sushto

              //krai na cikula e tova v uslovieto na while cikula
        while (!input.equals("No More Books")) {
            if (input.equals(wantedBook)) {
               isFound = true; // flaga
                break;
            }
            counter++;
            input = scanner.nextLine();//update
        }
if (isFound)   // taka zapisano oznachava true
    {
        System.out.printf("You checked %d books and found it.", counter);


    } else {
    System.out.println("The book you search is not here!");
    System.out.printf("You checked %d books.", counter);

}
    }
}
