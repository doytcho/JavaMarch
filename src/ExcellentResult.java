import java.util.Scanner;

public class ExcellentResult {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double number = Double.parseDouble(scan.nextLine());
        if (number >= 5.5) {
            System.out.println("Excellent!");
            ;
        }
    }
}
