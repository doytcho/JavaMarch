import java.util.Scanner;

public class AlcoholMarket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double whiskyPrice = Double.parseDouble(scan.nextLine());
        double beerLitres = Double.parseDouble(scan.nextLine());
        double wineLitres = Double.parseDouble(scan.nextLine());
        double rakiaLitres = Double.parseDouble(scan.nextLine());
        double whiskyLitres = Double.parseDouble(scan.nextLine());
        double rakiaPrice = whiskyPrice / 2;
        double winePrice = rakiaPrice * 0.6;
        double beerPrice = rakiaPrice * 0.2;
        System.out.printf("%.2f", whiskyLitres * whiskyPrice + wineLitres * winePrice + rakiaLitres * rakiaPrice + beerLitres * beerPrice);
    }
}
