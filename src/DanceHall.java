import java.util.Scanner;

public class DanceHall {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double lenght = Double.parseDouble(scan.nextLine());
        double widht = Double.parseDouble(scan.nextLine());
        double sideA = Double.parseDouble(scan.nextLine());
        double hallArea = lenght * widht * 0.9;
        double wardrobe = sideA * sideA;
        double freeArea = hallArea - wardrobe;
        double dancers = Math.floor(freeArea * 10000 / 7040);
        System.out.printf("%.0f", dancers);
    }
}
