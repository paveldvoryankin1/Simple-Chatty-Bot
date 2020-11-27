import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        double sum = 0;
        int cnt = 0;

        for (int i = a; i <= b; i++) {
            if (i % 3 == 0) {
                sum += i;
                cnt += 1;
            }
        }

        double avg = sum / cnt;
        System.out.println(avg);
    }
}