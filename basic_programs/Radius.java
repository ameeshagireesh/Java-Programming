import java.util.*;

public class Radius{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of circle");
        double r = sc.nextDouble();

        double area = 3.14*r*r;
        System.out.println("The area of the circle is: "+area);
    }
}