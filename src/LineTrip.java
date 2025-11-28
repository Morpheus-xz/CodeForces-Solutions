import java.util.*;
public class LineTrip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();

            List<Integer> list = new ArrayList<>();
            list.add(0);
            for (int i = 0; i < n; i++) {
                list.add(sc.nextInt());
            }
            list.add(x);
            n = list.size();
            int maxdis = Integer.MIN_VALUE;
            for (int i = 1; i < n; i++) {
                if(i==n-1){
                    maxdis=Math.max(maxdis,2*(list.get(i)-list.get(i-1)));
                }
                else{
                    maxdis=Math.max(maxdis,list.get(i)-list.get(i-1));
                }
            }
            System.out.println(maxdis);
        }
        sc.close();
    }
}
