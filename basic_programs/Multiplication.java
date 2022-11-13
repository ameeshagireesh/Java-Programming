import java.util.*;

public class Multiplication {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.println("The multiplication table is: ");
        
        for (int i=0; i<13; i++){
            System.out.println(n+" x "+i+" = "+(n*i));
        }
    }
}
