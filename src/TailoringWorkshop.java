import java.util.Scanner;

public class TailoringWorkshop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tables = Integer.parseInt(scan.nextLine());
        double lenght = Double.parseDouble(scan.nextLine());
        double widht = Double.parseDouble(scan.nextLine());
        double pokrivkaArea = (lenght + 0.6) * (widht + 0.6);
        double careArea = lenght * lenght / 4;
        System.out.printf("%.2f USD%n", pokrivkaArea * tables * 7 + careArea * tables * 9);
        System.out.printf("%.2f BGN", (pokrivkaArea * tables * 7 + careArea * tables * 9) * 1.85);
    }
}
