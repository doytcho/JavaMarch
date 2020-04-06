import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lenght = Integer.parseInt(scan.nextLine());
        int widht = Integer.parseInt(scan.nextLine());
        int height = Integer.parseInt(scan.nextLine());
        double percent = Double.parseDouble(scan.nextLine());
        double aquariumVolume = 1.0*lenght * widht * height / 1000;
        System.out.printf("%.3f", aquariumVolume * (100 - percent) / 100);
    }
}
