import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dogs = Integer.parseInt(scan.nextLine());
        int notDogs = Integer.parseInt(scan.nextLine());
        System.out.printf("%.2f lv.", dogs * 2.5 + notDogs * 4);
    }
}
