import java.util.Scanner;
public class GrasshopperOnALine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            long x = scanner.nextLong();
            long k = scanner.nextLong();
            if (x % k == 0) {
                System.out.println(2);
                System.out.println(1 + " " + (x - 1));
            } else {
                System.out.println(1);
                System.out.println(x);
            }
        }
        scanner.close();
    }
}
