import java.util.*;
public class Example4 {
	public static void main(String[] arges) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++) {
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    System.out.println(((int)(a/b))+(a%b));
		}
	}
}