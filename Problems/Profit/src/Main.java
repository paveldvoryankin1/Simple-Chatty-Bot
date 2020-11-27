import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initSum = scanner.nextInt();
        float interest = scanner.nextInt();
        int targetSum = scanner.nextInt();
        float currSum = initSum;
        int years = 0;

        while (currSum < targetSum) {
            currSum = currSum + currSum * interest / 100;
            years++;
        }

        System.out.println(years);
    }
}