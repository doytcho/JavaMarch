import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budjet = Double.parseDouble(scan.nextLine());
        int puzzels = Integer.parseInt(scan.nextLine());
        int dolls = Integer.parseInt(scan.nextLine());
        int tedyBear = Integer.parseInt(scan.nextLine());
        int minions = Integer.parseInt(scan.nextLine());
        int trucks = Integer.parseInt(scan.nextLine());
        double totalPrice = puzzels * 2.6 + dolls * 3 + tedyBear * 4.1 + minions * 8.2 + trucks * 2;
        if (puzzels + dolls + tedyBear + minions + trucks >= 50) {
            totalPrice = totalPrice * 0.75;
        }
        totalPrice = totalPrice * 0.9;
        if (totalPrice >= budjet) {
            System.out.printf("Yes! %.2f lv left.", totalPrice - budjet);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", budjet - totalPrice);
        }
    }
}
