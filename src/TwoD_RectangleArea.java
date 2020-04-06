import java.util.Scanner;

public class TwoD_RectangleArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x1 = Double.parseDouble(scan.nextLine());
        double y1 = Double.parseDouble(scan.nextLine());
        double x2 = Double.parseDouble(scan.nextLine());
        double y2 = Double.parseDouble(scan.nextLine());
        double lenght = Math.abs(x1 - x2);
        double widht = Math.abs(y1 - y2);
        System.out.printf("%.2f%n", lenght * widht);
        System.out.printf("%.2f", 2 * (lenght + widht));
    }
}
