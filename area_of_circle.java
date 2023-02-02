import java.util.*;
public class area_of_circle {
    public static void main(String args[]){
        System.out.print("Please enter the radius of circle: ");
        Scanner sc = new Scanner(System.in);
        float rad = sc.nextFloat();
        float area = 3.14f * rad *rad;
//        the f in 3.14f denotes that it is a float otherwise it is confused with double
        System.out.println("The are of circle is : "+ area);
    }
}
