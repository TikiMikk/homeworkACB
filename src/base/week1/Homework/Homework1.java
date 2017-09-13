package base.week1.Homework;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Сторона a");
        int sideA = sc.nextInt();
        System.out.println("Сторона b");
        int sideB = sc.nextInt();
        System.out.println("Сторона c");
        int sideC = sc.nextInt();
        byte sq = 2;

        String message = "";     // Теорема Піфагора
        if (Math.pow(sideA, sq) + Math.pow(sideB, sq) == Math.pow(sideC, sq)) {
            message = "Трикутник прямокутний";
        } else if (Math.pow(sideA, sq) + Math.pow(sideC, sq) == Math.pow(sideB, sq)) {
            message = "Трикутник прямокутний";
        } else if (Math.pow(sideB, sq) + Math.pow(sideC, sq) == Math.pow(sideA, sq)) {
            message = "Трикутник прямокутний";
        } else {
            message = "Трикутник не прямокутний";
        }

        System.out.println(message);
    }
}
