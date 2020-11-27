import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int curr = scanner.nextInt();
        int sum = curr;
        boolean reached1000 = false;
        
        while (curr != 0) {
            curr = scanner.nextInt();
            if (sum >= 1000) {
                reached1000 = true;
                sum -= 1000;
            }
            if (!reached1000) {
                sum += curr;
            }
        }

        System.out.println(sum);
    }
}
