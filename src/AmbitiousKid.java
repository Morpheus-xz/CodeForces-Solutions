import java.util.Scanner;

public class AmbitiousKid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int [] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            int ans = Integer.MAX_VALUE;
            for(int i=0;i<n;i++){
                ans=Math.min(ans,Math.abs(arr[i]));
            }
            System.out.println(ans);
    }
}
