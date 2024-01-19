import java.util.*;
public class r{
    public static void main(String[] sri){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = f(n,0);
        System.out.print(r-n);
    }
    static int f(int i , int s){
            if (i<1){
                return s;
            }
            return f(i-1,s+i);
        }
}