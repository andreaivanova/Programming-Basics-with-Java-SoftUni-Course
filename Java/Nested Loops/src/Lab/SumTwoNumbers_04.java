package Lab;


import java.util.Scanner;

public class SumTwoNumbers_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        boolean isFound = false;

        int combinationsCount = 0;
        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end; j++) {
                combinationsCount++;

                if (i + j == magicNumber){
                    System.out.printf("Combination N:%d (%d + %d = %d)", combinationsCount, i, j, magicNumber);
                    isFound = true;
                    break;
                }

            } if (isFound){
                break;
            }

        } if (!isFound){
            System.out.printf("%d combinations - neither equals %d", combinationsCount, magicNumber);
        }

        }

    }

