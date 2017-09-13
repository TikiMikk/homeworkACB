package base.week1.Home;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner sv = new Scanner(System.in);

        System.out.println("1");
        int a = sv.nextInt();
        System.out.println("2");
        int b = sv.nextInt();
        System.out.println("3");
        int c = sv.nextInt();

        if (a == b && b == c) {
            System.out.println("Result = " + a);
        } else if (a >= b && a >= c && b >= c) {
            System.out.println("max " + a);
            System.out.println("min = " + c);
        } else if (b >= a && b >= c && c >= a) {
            System.out.println("max = " + b);
            System.out.println("min = " + a);
        } else if (c >= b && c >= a && b >= a) {
            System.out.println("max = " + c);
            System.out.println("min = " + a);

        } else if (a >= b && a >= c && c >= b) {
            System.out.println("max = " + a);
            System.out.println("min = " + b);
        } else if (b >= a && b >= c && a >= c) {
            System.out.println("max = " + b);
            System.out.println("min = " + c);
        } else if (c >= b && c >= a && a >= b) {
            System.out.println("max = " + c);
            System.out.println("min = " + b);

        }
    }
}
