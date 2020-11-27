import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();
        int foodPerDay = scanner.nextInt();
        int flight = scanner.nextInt();
        int hotelPerNight = scanner.nextInt();

        int totalCost = days * foodPerDay + (days - 1) * hotelPerNight + flight * 2;
        System.out.println(totalCost);
    }
}