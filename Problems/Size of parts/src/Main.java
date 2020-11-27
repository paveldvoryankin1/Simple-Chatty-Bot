import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int fix = 0;
        int ship = 0;
        int reject = 0;
        int currentSize = 0;

        for (int i = 0; i < n; i++) {
            currentSize = scanner.nextInt();
            if (currentSize == 1) {
                fix++;
            } else if (currentSize == -1) {
                reject++;
            } else {
                ship++;
            }
        }

        System.out.println(ship + " " + fix + " " + reject);
    }
}