import java.util.Scanner;

public class Main {

    private static final Parabola P1 = new Parabola(0, -6, 1);

    public static SimpleColor getColor(double x, double y) {
        if (!P1.isPointInsideOfParabola(x, y) && x >= -6 && x < 0 && y >= -4 && y <= 5) {
            return SimpleColor.ORANGE;
        }
        if (P1.isPointInsideOfParabola(x, y) && y <= -4) {
            return SimpleColor.ORANGE;
        }
        if (!P1.isPointInsideOfParabola(x, y) && x <= 4 && x >= 0 && y >= -4 && y <= 0) {
            return SimpleColor.YELLOW;
        }
        if (!P1.isPointInsideOfParabola(x, y) && x <= 4 && x > 0 && y >= 0 && y <= 5) {
            return SimpleColor.WHITE;
        }
        if (!P1.isPointInsideOfParabola(x, y) && x <= 8 && x > 3 && y >= 0 && y <= 9) {
            return SimpleColor.BLUE;
        }
        if (P1.isPointInsideOfParabola(x, y) && y >= 5 && x >= -4 && x <= 1) {
            return SimpleColor.WHITE;
        }
        if (P1.isPointInsideOfParabola(x, y) && y >= 9 && x >= 1 && x <= 4) {
            return SimpleColor.WHITE;
        }
        return SimpleColor.GRAY;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите X: ");
        double x = scanner.nextDouble();

        System.out.print("Введите Y: ");
        double y = scanner.nextDouble();

        System.out.println(getColor(x, y));

        printColorForPoint(x, y);

    }
    public static void printColorForPoint(double x, double y) {
        System.out.println("(-4.0 ; 1.0) - " + getColor(-4, 1));
        System.out.println("(0.0 ; -5.0) - " + getColor(0, -5));
        System.out.println("(3.0 ; -1.0) - " + getColor(3, -1));
        System.out.println("(3.0 ; 1.0) - " + getColor(3, 1));
        System.out.println("(6.0 ; 4.0) - " + getColor(6, 4));
        System.out.println("(0.0 ; 7.0) - " + getColor(0, 7));
        System.out.println("(0.0 ; 0.0) - " + getColor(0, 0));
    }
}