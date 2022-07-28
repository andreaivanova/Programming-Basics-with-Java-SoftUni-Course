
import java.util.Scanner;

public class HousePainting_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        double xHeightHouse = Double.parseDouble(scanner.nextLine());
        double yLengthSideWall = Double.parseDouble(scanner.nextLine());
        double hOfRoofTriangleSide = Double.parseDouble(scanner.nextLine());

        //razhod zelena boq = 3.4
        // razhod za cherven boq = 4.3
        // za stenite zelena boq,za pokriva chervena

        //Стените имат следните размери:
        //•	Предната и задната стена са квадрати със страна „x“
        //	на предната стена има правоъгълна врата с широчина 1.2м и височина 2м

        //•	Страничните стени са правоъгълници със страни „x“ и „y“
        //	и на двете странични стени има по един квадратен прозорец със страна 1.5м

        //Покривът има следните размери:
        //•	Два правоъгълника със страни „x“ и „y“
        //•	Два равностранни триъгълника със страна „x“ и височина „h“
        double sideWallsArea = 2 * (xHeightHouse * yLengthSideWall);
        double windowsArea = 2 * (1.5 * 1.5);
        double sideWallAreaNoWindows = sideWallsArea - windowsArea;

        double mainWallsArea = 2 * (xHeightHouse * xHeightHouse);
        double door = 1.2 * 2;
        double mainWallsAreaNoDoor = mainWallsArea - door;

        double totalAreaAllWalls = sideWallAreaNoWindows + mainWallsAreaNoDoor;
        double greenPaint = totalAreaAllWalls / 3.4;


        double roofRectangles = 2 * (xHeightHouse * yLengthSideWall);
        double roofTriangles = 2 * (xHeightHouse * hOfRoofTriangleSide / 2);
        double totalAreaRoof = roofRectangles + roofTriangles;
        double redPaint = totalAreaRoof / 4.3;

        System.out.printf("%.2f", greenPaint);
        System.out.printf("%n%.2f", redPaint);






    }
}
