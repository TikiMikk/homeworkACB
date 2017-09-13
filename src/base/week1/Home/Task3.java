package base.week1.Home;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner sv = new Scanner(System.in);

        System.out.println("Ведіть число");
        int a = sv.nextInt();

        if (a % 7 == 0) {
            a = a * a;
        } else {
            a = a;
        }
        System.out.println(a);
    }
}
