import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double bonus = 0;
        int number = Integer.parseInt(scan.nextLine());
        if (number <= 100) {
            bonus = 5;
        } else if (number <= 1000) {
            bonus = number * 0.2;
        } else {
            bonus = number * 0.1;
        }
        if (number % 2 == 0) {
            bonus++;
        }
        if (number % 10 == 5) {
            bonus = bonus + 2;
        }
        System.out.println(bonus);
        System.out.println(bonus + number);
    }
}
