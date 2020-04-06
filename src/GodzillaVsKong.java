import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budjet = Double.parseDouble(scan.nextLine());
        int statists = Integer.parseInt(scan.nextLine());
        double costumPrice = Double.parseDouble(scan.nextLine());
        double totalSum = 0.1 * budjet;
        if (statists > 150) {
            costumPrice = costumPrice * 0.9;
        }
        totalSum = totalSum + statists * costumPrice;
        if (totalSum > budjet) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", totalSum - budjet);
        } else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", budjet - totalSum);
        }
    }
}
