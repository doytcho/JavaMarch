import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double area = Double.parseDouble(scan.nextLine());
        System.out.printf("The final price is: %.2f lv.%n", area * 7.61 * 0.82);
        System.out.printf("The discount is: %.2f lv.", area * 7.61 * 0.18);
    }
}
