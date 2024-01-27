class HeyThereEarth{ // Title Case
	 public static void main(String args[]){
        final int num = 5656; // final keyword used to declare constant values
        //num=231;
        System.out.println(num);
        int val1 = 0234; // octal representation of the value = '0' -> Syntax   
        System.out.println(val1);
        int val2 = 0b1110; // binary representation of the value // '0b' = Syntax for Binary representation
        System.out.println(val2);
        int val3 = 0xD; //  Hexa representation of the value //'0x' = Syntax
        System.out.println(val3);

    int a = 342 , b =567;
    System.out.println(Math.abs(a-b));
    int rootValue = 64;
    System.out.println(Math.sqrt(rootValue));
     int base = 2, exp = 16;
    System.out.println(Math.pow(base,exp));
    System.out.println(Math.min(a,b));
    System.out.println(Math.max(a,b));
    double gravity = 9.8;
    System.out.println(Math.ceil(gravity)); 
    System.out.println(Math.floor(gravity));

    int n = (int)23.45;
    int s =(int)Math.sqrt(121);
    System.out.println(n+" "+s);
    char ch = 98;
    char ch2 = 67; // UNICODE for characters (1-65535)
    char ch3 = 3; // UNICODE for characters
    System.out.println(ch);
    System.out.println(ch2);
    System.out.println(ch3);
    }

    
}