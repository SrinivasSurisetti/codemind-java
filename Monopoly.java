import java.util.*;
public class Sri{
    public static void main(String[] asr){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0;i<t;i++){
            int a=sc.nextInt();
            int b =sc.nextInt();
            int c = sc.nextInt();
            int mx1 = Math.max(a,b);
            int mx = Math.max(mx1,c);
            if(mx>(a+b+c)-mx) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}