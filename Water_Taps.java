import java.util.*;
public  class Tank{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();	
		int b = sc.nextInt();
		float x = 100/(float)a;
		float y = 100/(float)b;
		float s = 0;
		int tym = 0;
		while(s<100) {
		    s=x+y+s;
		    tym=1+tym;
		}
		System.out.print(tym);
    }
}