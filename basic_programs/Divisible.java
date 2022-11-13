import java.util.*;

public class Divisible {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        if (n%3 == 0 && n%5 == 0){
            System.out.println(n+" is divisble by both 3 and 5");
        } else {
            System.out.println(n+" is not divisble by both 3 and 5");
        }
    }
}
