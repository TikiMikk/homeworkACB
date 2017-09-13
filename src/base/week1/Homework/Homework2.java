package base.week1.Homework;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {

        Scanner sv = new Scanner(System.in);

        System.out.println("Перше число");
        int a = sv.nextInt();
        System.out.println("Друге число");
        int b = sv.nextInt();
        System.out.println("Третє число");
        int c = sv.nextInt();

        if (a % 2 == 0) {
            a = a * a * a;
        } else {
            a = 0;

            } if (b % 2 == 0) {
                b = b * b * b;
            } else {
                b = 0;

        } if (c % 2 == 0) {
            c = c * c * c;
        } else {
            c = 0;
        };

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        }
    }

