import java.util.*;

public class Sum {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter nth term: ");
        int n = sc.nextInt();

        int sum = 0;
        for(int i=1; i<n+1; i++){
            sum = sum+i;
        }
        System.out.println("1+2+...+"+n);
        System.out.println("The sum is: "+sum);
    }    
}
