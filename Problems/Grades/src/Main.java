import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int cntA = 0;
        int cntB = 0;
        int cntC = 0;
        int cntD = 0;

        for (int i = 0; i < n; i++) {
            int currGrade = scanner.nextInt();
            if (currGrade == 5) {
                cntA++;
            } else if (currGrade == 4) {
                cntB++;
            } else if (currGrade == 3) {
                cntC++;
            } else if (currGrade == 2) {
                cntD++;
            }
        }

        System.out.print(cntD + " " + cntC + " " + cntB + " " + cntA);
    }
}