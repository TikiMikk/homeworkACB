package base.week1.Homework;

import java.util.Scanner;

public class Homework15 {
    public static void main(String[] args) {

        Scanner sv = new Scanner(System.in);

        System.out.println("Площа круга");
        int s1 = sv.nextInt();
        System.out.println("Площа квадрата");
        int s2 = sv.nextInt();
        double r,a,d;

        r = Math.sqrt(s1 / 3.14);
        a = Math.sqrt(s2);
        d = Math.sqrt(s2 * 2);

        if (r <= (d / 2) && r > (a / 2) ) {
            System.out.println("Не судьба");
        } else if (r <= (d / 2) && r <= (a / 2) ) {
            System.out.println("Круг вписаний в квадрат");
        } else if (r >= (d / 2) ) {
            System.out.println("Круг описує квадрат");
        }
    }
}
