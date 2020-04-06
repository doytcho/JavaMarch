import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int secondsFirst = Integer.parseInt(scan.nextLine());
        int secondsSecond = Integer.parseInt(scan.nextLine());
        int secondsThurd = Integer.parseInt(scan.nextLine());
        int sumSeconds = secondsFirst + secondsSecond + secondsThurd;
        int minutes = sumSeconds / 60;
        int seconds = sumSeconds % 60;
        if (seconds < 10) {
            System.out.printf("%d:%02d", minutes, seconds);
        } else {
            System.out.printf("%d:%d", minutes, seconds);
        }
    }
}
