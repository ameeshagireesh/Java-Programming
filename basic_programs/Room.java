import java.util.*;

public class Room {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter room number: ");
        int room = sc.nextInt();

        System.out.print("Your subject is: ");
        if (room==604){
            System.out.print("Java Programming");
        } else if (room==605){
            System.out.print("Python Programming");
        } else {
            System.out.print("Invalid");
        }
    }
}