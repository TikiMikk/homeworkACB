package base.week1.Homework;

import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {

        Scanner sv = new Scanner(System.in);

        System.out.println("Введіть 1 число");
        int a = sv.nextInt();
        System.out.println("Введіть 2 число");
        int b = sv.nextInt();
        System.out.println("Введіть 3 число");
        int c = sv.nextInt();

        if (a == b || b == c || a == c) {
            System.out.println("Є хотя би 1-на пара");
        } else {
            System.out.println("Пар немає");
        }

    }
}
