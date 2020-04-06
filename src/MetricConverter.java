import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        double numberInMm = 0;
        Scanner scan = new Scanner(System.in);
        double number = Double.parseDouble(scan.nextLine());
        String imput = scan.nextLine();
        String output = scan.nextLine();
        switch (imput) {
            case "mm":
                numberInMm = number;
                break;
            case "cm":
                numberInMm = number * 10;
                break;
            case "m":
                numberInMm = number * 1000;
                break;
        }
        switch (output) {
            case "mm":
                System.out.printf("%.3f", numberInMm);
                break;
            case "cm":
                System.out.printf("%.3f", numberInMm / 10);
                break;
            case "m":
                System.out.printf("%.3f", numberInMm / 1000);
                break;
        }
    }
}
