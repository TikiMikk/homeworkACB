package base.week1.Homework;

import java.util.Scanner;

public class Homework7 {
    public static void main(String[] args) {

        Scanner sv = new Scanner(System.in);

        System.out.println("Номер місяця");
        byte n = sv.nextByte();

               if (n == 1) {
            System.out.println("Зима - Січень");
        } else if (n == 2) {
            System.out.println("Зима - Лютий");
        } else if (n == 3) {
            System.out.println("Весна - Березень");
        } else if (n == 4) {
            System.out.println("Весна - Квітень");
        } else if (n == 5) {
            System.out.println("Весна - Травень");
        } else if (n == 6) {
            System.out.println("Літо - Червень");
        } else if (n == 7) {
            System.out.println("Літо - Липень");
        } else if (n == 8) {
            System.out.println("Літо - Серпень");
        } else if (n == 9) {
            System.out.println("Осінь - Вересень");
        } else if (n == 10) {
            System.out.println("Осінь - Жовтень");
        } else if (n == 11) {
            System.out.println("Осінь - Листопад");
        } else if (n == 12) {
            System.out.println("Зима - Грудень");

            } else {
            System.out.println("Такого місяця не існує");
        }

        }
    }
