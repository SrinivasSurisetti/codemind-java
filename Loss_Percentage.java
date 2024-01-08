import java.util.*;
public class Lp{
    public static void main(String[] sri){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        double diff = a-b;
        double x =(diff/a)*100.00;
        System.out.printf("%.2f",x);
    } 
}