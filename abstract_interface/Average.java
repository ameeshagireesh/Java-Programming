package abstract_interface;
import java.util.*;

interface Numbers{
    int Process(int x, int y);
}

class Sum implements Numbers{
    public int Process(int x, int y){
        return x+y;
    }
}

class Average implements Numbers{
    public int Process(int x, int y){
        return (x+y)/2;
    }

    public static void main (String [] args){
        int x, y;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter first number: ");
        x = sc.nextInt();
        System.out.println("Enter second number: ");
        y = sc.nextInt();

        Sum s = new Sum();
        System.out.println("The sum is: "+s.Process(x, y));

        Average a = new Average();
        System.out.println("The average is: "+a.Process(x, y));
        
    }
}
