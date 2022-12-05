import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        float smallRadius = readRadius("малой");
        float bigRadius = readRadius("большой");

        Figure figure = new Figure(smallRadius, bigRadius);

        printArea("1", figure.getArea(3, 0, 4));
        printArea("2", figure.getArea(6, 1, 1));
        printArea("3", figure.getArea(2, 6, 2));
    }

    private static float readRadius(String circleName)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Введите радиус %s окружности: ", circleName);
        return scanner.nextFloat();
    }

    private static void printArea(String pictureName, float area)
    {
        System.out.printf("Площадь фигуры на рис. %s: %.3f\n", pictureName, area);
    }
}