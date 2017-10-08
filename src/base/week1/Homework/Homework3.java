package base.week1.Homework;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {

        Scanner sv = new Scanner(System.in);

        System.out.println("Введіть 3-ох значне число");
        int nomber = sv.nextInt();

        int a = (nomber / 10) / 10;
        int b = (nomber / 10) % 10;
        int c = nomber % 10;

        if (a == b && b == c) {
            System.out.println("Всі числа однакові");
        } else if (a == b || b == c || a == c) {
            System.out.println("Деякі з чисел однакові");
        } else {
            System.out.println("Всі числа різні");
        }
    }
}
