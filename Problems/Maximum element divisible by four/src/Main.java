import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int max = 0;
        int currNum;

        for (int i = 0; i < n; i++) {
            currNum = scanner.nextInt();
            if (currNum % 4 == 0 && currNum > max) {
                max = currNum;
            }
        }

        System.out.println(max);
    }
}