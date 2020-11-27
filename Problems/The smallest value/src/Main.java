import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long m = scanner.nextInt();
        long fact = 1;
        long i = 1;

        while (fact <= m) {
            i++;
            fact *= i;
        }
        System.out.println(i);
    }
}