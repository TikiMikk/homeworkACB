package base.week1.Homework;

import java.util.Scanner;

public class Homework11 {
    public static void main(String[] args) {

        Scanner sv = new Scanner(System.in);

        System.out.println("Введіть число від 1 до 99");
        int nomber = sv.nextInt();

        if (nomber % 10 == 0 || nomber >= 10 && nomber <= 20) {
            System.out.println(nomber + " копеек");
        } else if (nomber % 10 == 1) {
            System.out.println(nomber + " копейка");
        } else if (nomber % 10 >= 2 && nomber % 10 < 5) {
            System.out.println(nomber + " копейки");
        } else if (nomber % 10 >= 5) {
            System.out.println(nomber + " копеек");
        }
    }
}
