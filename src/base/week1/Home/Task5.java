package base.week1.Home;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner sv = new Scanner(System.in);

        System.out.println("Число 1");
        int a = sv.nextInt();
        System.out.println("Число 2");
        int b = sv.nextInt();

        if (a > b) {
            a = a - b;
            System.out.println("Різниця = " + a);
        } else {
            a = a + b;
            System.out.println("Сума = " + a);
        }

    }
}
