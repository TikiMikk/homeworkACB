package base.week1.Home;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Scanner sv = new Scanner(System.in);

        System.out.println("Число 1");
        int a = sv.nextInt();
        System.out.println("Число 2");
        int b = sv.nextInt();
        int c;
        c = a + b;

        if (c >= 11 && c <= 19) {
            System.out.println("Сума = " + c);
        } else {
            System.out.println("Nomber 1 = " + a);
            System.out.println("Nomber 2 = " + b);
        }

    }
}
