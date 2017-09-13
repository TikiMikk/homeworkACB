package base.week1.Home;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner sv = new Scanner(System.in);

        System.out.println("Время");
        int a = sv.nextInt();

        if (a >= 8 && a <=18) {
            System.out.println("Я на работе");
        } else {
            System.out.println("Я отдыхаю");
        }
    }
}
