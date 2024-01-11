import java.util.*;
public class s{
    public static void main(String[] gdfds){
        Scanner d=new Scanner(System.in);
        int a = d.nextInt();
        for(int i=0;i<a;i++) {
            int x = d.nextInt();
            int y = d.nextInt();
            if(2*x<=y || y==x){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}