import java.util.*;
public class sum_of_a_and_b_from_user {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b =sc.nextInt();
        int sum = a + b;
        System.out.print("The sum of a and b is: "+ sum);
    }
}
