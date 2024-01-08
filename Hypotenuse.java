import java.util.*;
public class Hyp {
    public static void main(String[] sri){
        Scanner s = new Scanner(System.in);
            int a=s.nextInt();
            int b=s.nextInt();
            double x =Math.sqrt((a*a)+(b*b));
            System.out.printf("%.2f",x);
    }
}