package abstract_interface;

import java.util.*;

interface Exam{
    int Pass(int no_tests);
}

interface Classify{
    String Average(int total, int no_tests);
}

class Result implements Exam, Classify{
    public int Pass(int no_tests){
        int total = 0;
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<no_tests; i++){
            System.out.println("Enter test mark: ");
            int mark = sc.nextInt();
            total = mark+total;
        }
        return total;
    }

    public String Average(int total, int no_tests){
        int avg = total/no_tests;

        if(avg>=60){
            return "First";
        } else if(avg>=50 && avg<60){
            return "SECOND";
        } else {
            return "NO DIVISION";
        }
    }
}
public class ExamResult {
    public static void main (String[] args){
        Result r = new Result();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of exams: ");
        int no_tests = sc.nextInt();
        int total = r.Pass(no_tests);
        System.out.println("The total marks obtained by the student is: "+ total);
        System.out.println(r.Average(total, no_tests));
    }
}
