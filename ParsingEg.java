public class ParsingEg{
    public static void main(String[] sri) {
        //Converting Strings to Integers
        String x = "10";
        String y = "1100";
        String z = "ABC";
        int a = Integer.parseInt(x);  //Parses the string "10" into an integer a
        int b = Integer.parseInt(y, 2);  //___Syntax = parseInt(VariableName,DecimalNo')__ Parses the binary string "1100" into an integer b.
        int c = Integer.parseInt(z, 16); ///Parses the hexadecimal string "ABC" into an integer c.
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        //Converting Integers to strings
        int p = 10;
        int q = 12;
        String i = Integer.toString(p,2); // Converts integer p into a binary string and assigns it to i.
        String j = Integer.toString(q,16); //Converts integer q into a hexadecimal string and assigns it to j.
        System.out.println(i);
        System.out.println(j);
    }
}