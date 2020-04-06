import java.util.Scanner;

public class CharityCampaign {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int days = Integer.parseInt(scan.nextLine());
        int sweeters = Integer.parseInt(scan.nextLine());
        int cakes = Integer.parseInt(scan.nextLine());
        int gofrets = Integer.parseInt(scan.nextLine());
        int pancake = Integer.parseInt(scan.nextLine());
        double totalSum = days * sweeters * (cakes * 45 + gofrets * 5.8 + pancake * 3.2);
        System.out.printf("%.2f", totalSum * 7 / 8);
    }
}
