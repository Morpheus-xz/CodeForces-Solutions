import java.util.Scanner;

public class CoverInWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String s = sc.next();
            boolean three = false;
            int empty=0;
            for(int i=0;i<n;i++){
                if(i+2<n && i<n && i+1<n && s.charAt(i)=='.' && s.charAt(i+1)=='.' && s.charAt(i+2)=='.'){
                    three = true;
                    break;
                }
                if(s.charAt(i)=='.'){
                    empty++;
                }
            }
            if(three){
                System.out.println(2);
            }
            else{
                System.out.println(empty);
            }
        }
        sc.close();
    }
}
