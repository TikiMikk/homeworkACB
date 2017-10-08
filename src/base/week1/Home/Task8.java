package base.week1.Home;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sv = new Scanner(System.in);

        System.out.println("Введіть 1-ше число");
        int a = sv.nextInt();
        System.out.println("Введіть 2-ге число");
        int b = sv.nextInt();

        if ((a - b) % 10 == 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
