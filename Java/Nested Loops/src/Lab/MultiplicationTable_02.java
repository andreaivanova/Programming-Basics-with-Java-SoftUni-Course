package Lab;

public class MultiplicationTable_02 {
    public static void main(String[] args) {
        //vynshen for int i = 1; i <= 10; i++;
        //vytreshen for int j = 1; j <= 10; j++;
        //.shtoto pyrvo vyrti vtoriq mnojitel a PYRVIq sedi samo edinica
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                int result = i * j;
                System.out.printf("%d * %d = %d%n", i, j, result);

            }

        }
    }
}