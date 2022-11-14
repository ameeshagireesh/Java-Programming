package abstract_interface;

import java.util.*;

abstract class Special {
    abstract double Process(double p, double r);
}

class Discount extends Special {
    double net;

    double Process(double p, double r) {
        net = p - p * (r / 100);
        return net;
    }
}

class Total extends Special {
    double total;

    double Process(double p, double r) {
        total = p + p * (r / 100);
        return total;
    }
}

public class Process {
    public static void main(String args[]) {
        double ret, p, r;
        Scanner sc = new Scanner(System.in);
        Discount d = new Discount();
        Total t = new Total();

        try {
            System.out.println("Enter P and R to compute discount : ");
            p = sc.nextDouble();
            r = sc.nextDouble();
            ret = d.Process(p, r);
            System.out.println("Discount : " + ret);
            System.out.println("Enter P and R to compute Total : ");
            p = sc.nextDouble();
            r = sc.nextDouble();
            ret = t.Process(p, r);
            System.out.println("Total : " + ret);
        } catch (Exception e) {
            System.out.println("Error : " + e);
        }
    }
}