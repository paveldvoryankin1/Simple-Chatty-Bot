import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean res = false;
        if (n > -15 && n <= 12) {
            res = true;
        } else if (n > 14 && n < 17) {
            res = true;
        } else if (n >= 19) {
            res = true;
        }
        if (res) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
