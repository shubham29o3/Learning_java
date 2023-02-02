//Conversion happens when : type compatible and destination type > source type
// byte->short->int->float->long -> double

import java.util.*;
public class type_conversion {
    public static void main (String args[]) {
        byte a = 23;
        long b=a;
        // Explicit type conversion
        System.out.print(b +"\n");
        Scanner sc = new Scanner(System.in);
        float num = sc.nextInt(); //Explicit conversion
        System.out.print(num);
    }
}
