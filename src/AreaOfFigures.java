import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String figure = scan.nextLine();
        double area = 0;
        switch (figure) {
            case "square":
                double side = Double.parseDouble(scan.nextLine());
                area = side * side;
                break;
            case "rectangle":
                double sideA = Double.parseDouble(scan.nextLine());
                double sideB = Double.parseDouble(scan.nextLine());
                area = sideA * sideB;
                break;
            case "circle":
                double radius = Double.parseDouble(scan.nextLine());
                area = Math.PI * radius * radius;
                break;
            case "triangle":
                double a = Double.parseDouble(scan.nextLine());
                double h = Double.parseDouble(scan.nextLine());
                area = a * h / 2;
                break;
        }
        System.out.printf("%.3f", area);
    }
}
