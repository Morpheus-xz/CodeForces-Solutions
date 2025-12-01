import java.util.Scanner;

public class InSearchOfAnEasyProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        boolean hard = false;
        for (int i = 0; i < n; i++) {
            if (sc.nextInt() == 1) {
                hard = true;
            }
        }
        if (hard) System.out.println("HARD");
        else System.out.println("EASY");

    }
}
