import java.util.Scanner;

public class UnitArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int pc=0;
            int nc=0;
            int[] arr = new int[n];
            for(int i=0;i<n;i++) {
                arr[i] = sc.nextInt();
            }
            for(int i=0;i<n;i++) {
                if(arr[i]==1) {
                    pc++;
                }
                else{
                    nc++;
                }
            }
            int op=0;
            while(pc<nc || nc%2==1){
                nc--;pc++;op++;
            }
            System.out.println(op);
        }
    }
}
